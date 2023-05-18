/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chejo
 */
public class Persona {
    private int id_person;
    private int person_type_id;
    private String name;
    private String lastName;
    private String dni;
    private String email;
    private String password;

    public Persona(int id_person, int person_type_id, String name, String lastName, String dni, String email, String password) {
        this.id_person = id_person;
        this.person_type_id = person_type_id;
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.email = email;
        this.password = password;
    }

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person = id_person;
    }

    public int getPerson_type_id() {
        return person_type_id;
    }

    public void setPerson_type_id(int person_type_id) {
        this.person_type_id = person_type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
