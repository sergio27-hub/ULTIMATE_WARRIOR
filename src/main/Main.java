/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import DAO.Conexion;
import view.Inicio;

/**
 *
 * @author chejo
 */
public class Main {
    public static void main(String[] args){
    
        Conexion.conectar();
        
        Inicio inicio = new Inicio();
        inicio.setVisible(true);      
        
    }
    
}
