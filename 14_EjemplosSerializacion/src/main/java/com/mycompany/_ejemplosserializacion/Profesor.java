/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejemplosserializacion;

/**
 *
 * @author Dell
 */
public class Profesor extends Persona {
    
     private int num_empleado;
    
    public Profesor(){
    
    }

    public Profesor(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public Profesor(int num_empleado, String nombre, int edad) {
        super(nombre, edad);
        this.num_empleado = num_empleado;
    }

    Profesor(int numero_empleado, String nombre, int edad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

    String tipoPersona() {
        return ("Profesor");
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }
    
}
