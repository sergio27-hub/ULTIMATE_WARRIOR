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
    
    public ArrayList<Person> getAllTrainers() throws SQLException { 
        ArrayList<Person> trainers = new ArrayList<Person>();

        ResultSet results = Conexion.ejecutarSentencia(
                "SELECT NAME , LASTNAME FROM " + personTable
                + " WHERE PERSON_TYPE_ID ='2';"); // El 2 referencia a Trainer

        while (results.next()) {
            String name = results.getString(1);
            String lastname = results.getString(2);
            trainers.add(new Person(name, lastname,0));
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
                "SELECT P.NAME , P.LASTNAME, D.DESCRIPTION , P.DNI , PD.HOURS FROM " + personTable
                + " P INNER JOIN PERSON_ DISCIPLINE PD ON P.ID_PERSON = TRAINER_ID INNER JOIN DISCIPLINES D ON PERSON_DISCIPlINE.DISCIPLINE_ID = D.DISCIPLINE_ID "
                + " ORDER BY ID_PERSON");

        while (results.next()) {
            String name = results.getString(1);
            String lastname = results.getString(2);
            String discipline = results.getString(3);
            String dni = results.getString(4);
            String hours = results.getString(5);
            students.add(new Person(-1, name, lastname, discipline, dni, hours));
        }

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

    public void createTrainer(Person user) {
        String email = user.getEmail();
        String password = user.getPassword();
        String dni = user.getDni();
        String lastname = user.getLastName();
        String name = user.getName();
        int personatype = 2;

        String query = "INSERT INTO " + personTable + "(persona_type_id,name,lastname,dni,email,password)" + " VALUES ('" + personatype + "','" + name + "','" + lastname + "','" + dni + "','" + email + "', '" + password + "')";
        Conexion.ejecutarUpdate(query);
    }

    public void createStudent(Person user) {
        String email = user.getEmail();
        String password = user.getPassword();
        String dni = user.getDni();
        String lastname = user.getLastName();
        String name = user.getName();
        int personatype = 3;

        String query = "INSERT INTO " + personTable + "(persona_type_id,name,lastname,dni,email,password)" + " VALUES ('" + personatype + "','" + name + "','" + lastname + "','" + dni + "','" + email + "', '" + password + "')";

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
