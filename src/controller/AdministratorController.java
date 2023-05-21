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

    public boolean login(String email, String password) {
        try {
            boolean loginRequest = new AdministratorService().login(email, password);	//Request es pregunta, Response es respuesta
            return loginRequest;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<Person> getAllTrainers() {
        try {
            ArrayList<Person> trainers = new AdministratorService().getAllTrainers();
            return trainers;
        } catch (Exception e) {
            return null;
        }
    }
    
    public ArrayList<Discipline> getAllDisciplines() {
        try {
            ArrayList<Discipline> disciplines = new AdministratorService().getAllDisciplines();
            return disciplines;
        } catch (Exception e) {
            return null;
        }
    }

    public ArrayList<Person> getTrainers() {
        try {
            ArrayList<Person> trainers = new AdministratorService().getTrainers();
            return trainers;
        } catch (Exception e) {
            return null;
        }
    }

    public ArrayList<Person> getStudents() {
        try {
            ArrayList<Person> students = new AdministratorService().getStudents();
            return students;
        } catch (Exception e) {
            return null;
        }
    }

    public ArrayList<Discipline> getDisciplines() {
        try {
            ArrayList<Discipline> disciplines = new AdministratorService().getDisciplines();
            return disciplines;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean createTrainer(Person person) {
        try {
            new AdministratorService().createTrainer(person);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean createStudent(Person person) {
        try {
            new AdministratorService().createStudent(person);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean createDiscipline(Discipline discipline) {
        try {
            new AdministratorService().createDiscipline(discipline);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean addTrainerToDiscipline(int discipline_id, int trainer_id) {
        try {
            new AdministratorService().addTrainerToDiscipline(discipline_id, trainer_id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
