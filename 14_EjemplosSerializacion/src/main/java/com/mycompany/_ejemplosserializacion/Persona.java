/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejemplosserializacion;

import java.io.Serializable;

/**
 *
 * @author Dell
 */

import java.io.Serializable;
public abstract class Persona {
    
    //de persona es donde voy a sacar los archivos

    /**
     *
     */

public abstract class Persona implements Serializable 
{
}
    //esta persona va a ser polimorfica
    private String nombre;
    private int edad;
    
    public Persona(){
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        //metodo abstracto para el polimorfismo
    abstract String tipoPersona();
    
}
