/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chejo
 */
public class Person {
    private int id_person;
    private int person_type_id;
    private String name;
    private String lastname;
    private String dni;
    private String email;
    private String password;
    private int discipline_id;
    private String discipline;
    private int trainer_id;
    private String trainer;
    private String hours;

    public Person(int id_person, String email, String password) {
        this.id_person = id_person;
        this.email = email;
        this.password = password;
    }
    
    public Person(int id_person,String name, String lastname, int person_type_id) {
        this.id_person = id_person;
        this.person_type_id = person_type_id;
        this.name = name;
        this.lastname = lastname;
    }
    
    public Person(int id_person, String name, String lastname, String email, String password, String dni) { 
        this.id_person = id_person;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.dni = dni;
    }
    
    public Person(int id_person, String name, String lastname, String dni, String email, String password, String discipline, String trainer, String hours) { 
        this.id_person = id_person;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.dni = dni;
        this.discipline = discipline;
        this.trainer = trainer;
        this.hours = hours;
    }
    
    public Person(int id_person, String name, String lastname, String email, String password, String dni, int discipline_id, int trainer_id, String hours) { 
        this.id_person = id_person;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.dni = dni;
        this.discipline_id = discipline_id;
        this.trainer_id = trainer_id;
        this.hours = hours;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDiscipline_id() {
        return discipline_id;
    }

    public void setDiscipline_id(int discipline_id) {
        this.discipline_id = discipline_id;
    }

    public int getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }
    
    public Person(String email, String password) {
	this(-1, email, password);
    }
    
    public Person(String name, String lastname, int person_type_id) {
	this(-1,name, lastname,0);
    }
    
    public Person(String name, String lastname, String email, String password, String dni) {
	this(-1, name, lastname,email, password, dni);
    }
    
    public Person(String name, String lastname, String dni, String email, String password, String discipline, String trainer, String hours) {
	this(-1, name, lastname, dni, email, password, discipline, trainer, hours);
    }
    
    public Person(String name, String lastname, String email, String password, String dni, int discipline_id, int trainer_id, String hours) {
	this(-1, name, lastname,email, password, dni, discipline_id, trainer_id, hours);
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

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
    
    
    
    @Override
    public String toString() {
	return "Person [" +"id="+ id_person + "email=" + email + ", password=" + password + "]";
    }
    
    
}
