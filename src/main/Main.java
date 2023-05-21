/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import bbdd.Conexion;
import view.Login;

/**
 *
 * @author chejo
 */
public class Main {
    public static void main(String[] args){
    
        //InicioAdmin admin = new InicioAdmin();
        //admin.setVisible(true);
        
        Conexion.conectar();
        
        Login inicio = new Login();
        inicio.setVisible(true); 
        
        
        
    }
    
}
