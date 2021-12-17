/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejemplosserializacion;

/**
 *
 * @author Dell
 */

//herencia 
public class Alumno extends Persona {
    
     private int boleta;
    
    public Alumno(){
    }

    public Alumno(int boleta) {
        this.boleta = boleta;
    }

    public Alumno(int boleta, String nombre, int edad) {
        super(nombre, edad);
        this.boleta = boleta;
    }

    Alumno(int bol, String nombre, int edad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Alumno(int bol, String nombre, int edad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    String tipoPersona() {
        return ("Alumno");
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }
    
}
