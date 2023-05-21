/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbdd;

import model.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Discipline;

/**
 *
 * @author chejo
 */
public class AdministratorService {

    String personTable = "Persons";
    String disciplineTable = "Disciplines";
    String personDisciplineTable = "person_discipline";

    public boolean login(String email, String password) throws SQLException {

        ResultSet results = Conexion.ejecutarSentencia("SELECT * FROM " + personTable + " WHERE email = '" + email + "' AND password = '" + password + "'");

        while (results.next()) {
            return true;
        }

        return false;
    }

    public ArrayList<Person> getAllStudents() throws SQLException {
        ArrayList<Person> students = new ArrayList<Person>();

        ResultSet results = Conexion.ejecutarSentencia(
                "SELECT P.NAME, P.LASTNAME, P.DNI, P.EMAIL, P.PASSWORD FROM " + personTable
                + " P WHERE P.PERSON_TYPE_ID ='3';"); // El 3 referencia a Alumno

        while (results.next()) {
            String name = results.getString(1);
            String lastname = results.getString(2);
            String dni = results.getString(3);
            String email = results.getString(4);
            String password = results.getString(5);
            students.add(new Person(name, lastname, email, password, dni));
        }

        return students;
    }

    public int getCountPersons() throws SQLException {
        int id = 0;

        ResultSet results = Conexion.ejecutarSentencia("SELECT COUNT(*) FROM " + personTable);

        while (results.next()) {
            String count = results.getString(1);
            id = Integer.parseInt(count);
        }

        return id;
    }

    public ArrayList<Person> getAllTrainers() throws SQLException {
        ArrayList<Person> trainers = new ArrayList<Person>();

        ResultSet results = Conexion.ejecutarSentencia(
                "SELECT * FROM " + personTable
                + " WHERE PERSON_TYPE_ID ='2';"); // El 2 referencia a Trainer

        while (results.next()) {
            String name = results.getString(3);
            String lastname = results.getString(4);
            String dni = results.getString(5);
            String email = results.getString(6);
            String password = results.getString(7);
            trainers.add(new Person(name, lastname, email, password, dni));
        }

        return trainers;
    }

    public ArrayList<Person> getAllTrainersForDiscipline() throws SQLException {
        ArrayList<Person> trainers = new ArrayList<Person>();

        ResultSet results = Conexion.ejecutarSentencia(
                "SELECT NAME , LASTNAME FROM " + personTable
                + " WHERE PERSON_TYPE_ID ='2';"); // El 2 referencia a Trainer

        while (results.next()) {
            String name = results.getString(1);
            String lastname = results.getString(2);
            trainers.add(new Person(name, lastname, 0));
        }

        return trainers;
    }

    public ArrayList<Discipline> getAllDisciplines() throws SQLException {
        ArrayList<Discipline> disciplines = new ArrayList<Discipline>();

        ResultSet results = Conexion.ejecutarSentencia("SELECT NAME , DESCRIPTION FROM " + disciplineTable);

        while (results.next()) {
            String name = results.getString(1);
            String description = results.getString(2);
            disciplines.add(new Discipline(name, description));
        }

        return disciplines;
    }

    public ArrayList<Person> getTrainers() throws SQLException {
        ArrayList<Person> trainers = new ArrayList<Person>();

        ResultSet results = Conexion.ejecutarSentencia(
                "SELECT P.NAME , P.LASTNAME, D.DESCRIPTION , P.DNI FROM " + personTable
                + " P INNER JOIN PERSON_ DISCIPLINE ON P.ID_PERSON = TRAINER_ID INNER JOIN DISCIPLINES D ON PERSON_DISCIPlINE.DISCIPLINE_ID = D.DISCIPLINE_ID"
                + " ORDER BY ID_PERSON");

        while (results.next()) {
            String name = results.getString(1);
            String lastname = results.getString(2);
            String discipline = results.getString(3);
            String dni = results.getString(4);
            trainers.add(new Person(-1, name, lastname, discipline, dni, ""));
        }

        return trainers;
    }

    public ArrayList<Person> getStudents() throws SQLException {
        ArrayList<Person> students = new ArrayList<Person>();

        ResultSet results = Conexion.ejecutarSentencia(
                "SELECT P.ID_PERSON, P.NAME, P.LASTNAME, P.DNI, P.EMAIL, P.PASSWORD, D.NAME, PD.HOURS "
                + "FROM " + personTable + " P "
                + "INNER JOIN PERSON_DISCIPLINE PD ON P.ID_PERSON = PD.ALUMN_ID "
                + "INNER JOIN DISCIPLINES D ON PD.DISCIPLINE_ID = D.DISCIPLINE_ID WHERE P.PERSON_TYPE_ID = 3");

        while (results.next()) {
            String id = results.getString(1);
            String name = results.getString(2);
            String lastname = results.getString(3);
            String dni = results.getString(4);
            String email = results.getString(5);
            String password = results.getString(6);
            String discipline = results.getString(7);
            String hours = results.getString(8);

            students.add(new Person(Integer.parseInt(id), name, lastname, dni, email, password, discipline, "", hours));
            /* ResultSet resultsTrainer = Conexion.ejecutarSentencia(
                    "SELECT P.NAME, P.LASTNAME "
                    + "FROM " + personTable + " P "
                    + "INNER JOIN PERSON_DISCIPLINE PD ON P.ID_PERSON = PD.ALUMN_ID "
                    + "WHERE PD.ALUMN_ID = '" + id + "'");

            while (resultsTrainer.next()) {
                System.out.print("Hola");
                System.out.print(results.getString(1));
                String trainerName = results.getString(1);
                String trainerLastname = results.getString(2);
                students.add(new Person(-1, name, lastname, dni, email, password, discipline, trainerName + " " + trainerLastname, hours));
            }*/
        }
        /*ArrayList<Integer> trainers_id = new ArrayList<Integer>();
        for (Person student : students) {
            /*ResultSet resultsTrainer = Conexion.ejecutarSentencia(
                    "SELECT PD.TRAINER_ID "
                    + "FROM " + personTable + " P "
                    + "INNER JOIN PERSON_DISCIPLINE PD ON P.ID_PERSON = PD.ALUMN_ID "
                    + "WHERE PD.ALUMN_ID = '" + student.getId_person() + "'");*/
            
             /*ResultSet resultsTrainer = Conexion.ejecutarSentencia(
                    "SELECT ID_PERSON FROM PERSONS");

            //System.out.print(student.getId_person());
            while (resultsTrainer.next()) {
                //System.out.print("Hola2");
                String idTrainer = results.getString(1);
                trainers_id.add(Integer.parseInt(idTrainer));
                
                System.out.print(idTrainer);
            }
        }
           System.out.print(trainers_id);
        for (int i = 0; i< trainers_id.size(); i++) {
            ResultSet lastResults = Conexion.ejecutarSentencia("SELECT NAME, LASTNAME FROM " + personTable + " WHERE ID_PERSON=" + "'" + trainers_id.get(i) + "'");

            while (lastResults.next()) {

                String trainerName = results.getString(1);
                String trainerLastname = results.getString(2);
                students.get(i).setTrainer( trainerName + " " + trainerLastname);
                
            }
        }*/

        return students;
    }

    public ArrayList<Discipline> getDisciplines() throws SQLException {
        ArrayList<Discipline> disciplines = new ArrayList<Discipline>();

        ResultSet results = Conexion.ejecutarSentencia("SELECT NAME, DESCRIPTION FROM " + disciplineTable);

        while (results.next()) {
            String name = results.getString(1);
            String description = results.getString(2);
            disciplines.add(new Discipline(-1, name, description));
        }

        return disciplines;
    }

    public void createTrainer(Person person) {
        String email = person.getEmail();
        String password = person.getPassword();
        String dni = person.getDni();
        String lastname = person.getLastname();
        String name = person.getName();
        int personatype = 2;

        String query = "INSERT INTO " + personTable + "(person_type_id,name,lastname,dni,email,password)" + " VALUES (" + personatype + ",'" + name + "','" + lastname + "','" + dni + "','" + email + "', '" + password + "')";
        Conexion.ejecutarUpdate(query);
    }

    public void createStudent(Person person, int student_id) {

        String email = person.getEmail();
        String password = person.getPassword();
        String dni = person.getDni();
        String lastname = person.getLastname();
        String name = person.getName();
        int personatype = 3;

        String query = "INSERT INTO " + personTable + "(person_type_id,name,lastname,dni,email,password)" + " VALUES ('" + personatype + "','" + name + "','" + lastname + "','" + dni + "','" + email + "', '" + password + "')";

        Conexion.ejecutarUpdate(query);
        addStudentToTrainer(person.getDiscipline_id(), person.getTrainer_id(), student_id, person.getHours());
    }

    public void addStudentToTrainer(int discipline_id, int trainer_id, int alumn_id, String hours) {

        String query = "INSERT INTO " + personDisciplineTable + "(trainer_id,discipline_id, alumn_id, hours)" + " VALUES ('" + trainer_id + "','" + discipline_id + "','" + alumn_id + "','" + hours + "')";

        Conexion.ejecutarUpdate(query);
    }

    public void createDiscipline(Discipline discipline) {
        String name = discipline.getName();
        String description = discipline.getDescription();

        String query = "INSERT INTO " + disciplineTable + "(description,name)" + " VALUES ('" + description + "','" + name + "')";

        Conexion.ejecutarUpdate(query);
    }

    public void addTrainerToDiscipline(int discipline_id, int trainer_id) {

        String query = "INSERT INTO " + personDisciplineTable + "(trainer_id,discipline_id)" + " VALUES ('" + trainer_id + "','" + discipline_id + "')";

        Conexion.ejecutarUpdate(query);
    }

}
