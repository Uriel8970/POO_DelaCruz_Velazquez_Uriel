/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejemplosserializacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Funciones {
    
     //variables y objetos
    ArrayList<Persona> listapersonas = new ArrayList();
    String rep = "si";
    String nombre = "";
    int edad, numero_empleado, bol;
    
    //vamos aplicar el polimorfismo
    Profesor profesor = new Profesor();
    
    Alumno alumno = new Alumno();
    
    //menu
    
    void menu(){
    
        //ciclo infinito
        while(true){
            //ciclo para repetirlo
            while(rep.equalsIgnoreCase("si")){
                //mis excepciones
                try{
                    String var = JOptionPane.showInputDialog("Ingresa la Opcion deseada: \n"
                            + "1.- Registrar nuevo Profesor."
                            + "2.- Registrar nuevo Alumno."
                            + "3.- Consultar Alumnos"
                            + "4.- Salir.");
                    
                    if(var == null){
                        System.exit(0);
                    }
                    
                    int opcion = Integer.parseInt(var);
                    
                    switch (opcion) {
                        case 1:
                            //metodos
                            pedirDatosProfesor();
                            //asignar los datos del profesor
                            profesor = new Profesor(numero_empleado, nombre, edad);
                            //para guardarlo
                            guardarProfesor();
                            break;
                        
                        case 2:
                            pedirDatosAlumno();
                            alumno = new Alumno(bol, nombre, edad);
                            guardarAlumno();
                            break;
                        
                        case 3:
                            //metodo para leer a los alumnos
                            leerAlumno();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    rep = JOptionPane.showInputDialog("¿Desea repetir?");
                
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                
                }
            }
        }
    
}

    private void pedirDatosProfesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void guardarProfesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pedirDatosAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void guardarAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void leerAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
