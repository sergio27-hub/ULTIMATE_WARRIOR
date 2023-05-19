/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import model.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chejo
 */
public class PersonService {
    	String tableName = "Persons";
        
        public boolean login(String email, String password) throws SQLException{

            ResultSet results = Conexion.ejecutarSentencia("SELECT * FROM " + tableName + " WHERE email = '"+email+"' AND password = '"+ password+"'");

            while(results.next()) {
                return true;
            }

            return false;
	}
	
	public ArrayList<Person> getUsers() throws SQLException{
            ArrayList<Person> users = new ArrayList<Person>();

            ResultSet results = Conexion.ejecutarSentencia("SELECT * FROM " + tableName);

            while(results.next()) {
                String username = results.getString(6);
                String password = results.getString(7);
                users.add(new Person(username, password));
            }

            return users;
	}

	public void createUser(Person user) {
            String email = user.getEmail();
            String password = user.getPassword();

            String query = "INSERT INTO "+tableName+" VALUES ('"+email+"', '"+password+"')";

            Conexion.ejecutarUpdate(query);
	}
    
}
