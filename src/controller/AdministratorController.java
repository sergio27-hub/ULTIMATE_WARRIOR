/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bbdd.AdministratorService;
import java.util.ArrayList;
import model.Discipline;
import model.Person;

/**
 *
 * @author chejo
 */
public class AdministratorController {

    private AdministratorService service = new AdministratorService();
    public boolean login(String email, String password) {
        try {
            boolean loginRequest = service.login(email, password);	//Request es pregunta, Response es respuesta
            return loginRequest;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<Person> getAllTrainersForDiscipline() {
        try {
            ArrayList<Person> trainers = service.getAllTrainersForDiscipline();
            return trainers;
        } catch (Exception e) {
            return null;
        }
    }
    
    public ArrayList<Person> getAllTrainers() {
        try {
            ArrayList<Person> trainers =  service.getAllTrainers();
            return trainers;
        } catch (Exception e) {
            return null;
        }
    }
    
    public ArrayList<Person> getAllStudents() {
        try {
            ArrayList<Person> students =  service.getAllStudents();
            return students;
        } catch (Exception e) {
            return null;
        }
    }
    
    public ArrayList<Discipline> getAllDisciplines() {
        try {
            ArrayList<Discipline> disciplines = service.getAllDisciplines();
            return disciplines;
        } catch (Exception e) {
            return null;
        }
    }

    public ArrayList<Person> getTrainers() {
        try {
            ArrayList<Person> trainers = service.getTrainers();
            return trainers;
        } catch (Exception e) {
            return null;
        }
    }

    public ArrayList<Person> getStudents() {
        try {
            ArrayList<Person> students = service.getStudents();
            return students;
        } catch (Exception e) {
            return null;
        }
    }

    public ArrayList<Discipline> getDisciplines() {
        try {
            ArrayList<Discipline> disciplines = service.getDisciplines();
            return disciplines;
        } catch (Exception e) {
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
        } catch (Exception e) {
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

}
