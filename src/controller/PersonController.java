/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.PersonService;
import java.util.ArrayList;
import model.Person;

/**
 *
 * @author chejo
 */
public class PersonController {
    
    public boolean login(String email, String password) {
        try {
            boolean loginRequest = new PersonService().login(email, password);	//Request es pregunta, Response es respuesta
            return loginRequest;
        } catch(Exception e) {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        try {
            ArrayList<Person> users = new PersonService().getUsers();	
            return users;
        } catch(Exception e) {
            return null;
        }
    }

    public void createUser(Person person) {
        new PersonService().createUser(person);
    }
    
}
