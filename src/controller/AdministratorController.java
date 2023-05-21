/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bbdd.AdministratorService;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Discipline;
import model.Person;

/**
 *
 * @author chejo
 */
public class AdministratorController {

    private final AdministratorService service = new AdministratorService();

    public int login(String email, String password) {
        try {
            int personType = service.login(email, password);
            return personType;
        } catch (SQLException e) {
            return 0;
        }
    }

    public ArrayList<Person> getAllTrainersForDiscipline() {
        try {
            ArrayList<Person> trainers = service.getAllTrainersForDiscipline();
            return trainers;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<Person> getAllTrainers() {
        try {
            ArrayList<Person> trainers = service.getAllTrainers();
            return trainers;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<Person> getAllStudents() {
        try {
            ArrayList<Person> students = service.getAllStudents();
            return students;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<Discipline> getAllDisciplines() {
        try {
            ArrayList<Discipline> disciplines = service.getAllDisciplines();
            return disciplines;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<Person> getTrainers() {
        try {
            ArrayList<Person> trainers = service.getTrainers();
            return trainers;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<Person> getStudents() {
        try {
            ArrayList<Person> students = service.getStudents();
            return students;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<Discipline> getDisciplines() {
        try {
            ArrayList<Discipline> disciplines = service.getDisciplines();
            return disciplines;
        } catch (SQLException e) {
            return null;
        }
    }

    public boolean createTrainer(Person person) {
        try {
            service.createTrainer(person);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean createStudent(Person person) {
        try {
            int student_id = service.getCountPersons() + 1;
            service.createStudent(person, student_id);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean createDiscipline(Discipline discipline) {
        try {
            service.createDiscipline(discipline);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean addTrainerToDiscipline(int discipline_id, int trainer_id) {
        try {
            service.addTrainerToDiscipline(discipline_id, trainer_id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isEmpty() {
        ArrayList<Person> trainers = getTrainers();
        ArrayList<Person> students = getStudents();
        return (trainers == null || trainers.isEmpty()) && (students == null || students.isEmpty());
    }

}
