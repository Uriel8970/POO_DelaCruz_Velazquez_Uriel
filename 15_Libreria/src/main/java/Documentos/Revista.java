/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentos;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Revista {
    
    //Tipo_Revista -< espectaculos, chismes, de no tengo idea pq no compro
    private String tiporevista;
    private String nombre;
    private String autor;
    private String editorial;
    private float precio;

    public Revista(){
    
    }

    public Revista(String tiporevista, String nombre, String autor, String editorial, float precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
        this.tiporevista = tiporevista;
    }

    public String getTiporevista() {
        return tiporevista;
    }

    public void setTiporevista(String tiporevista) {
        this.tiporevista = tiporevista;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    //los datos del tipo de revista 
    
    public void aceptarDatos(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la revista: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresa el nombre del autor: ");
        autor = entrada.nextLine();
        System.out.println("Ingresa la editorial de la revista: ");
        editorial = entrada.nextLine();
        System.out.println("Ingresa el tipo de revista:");
        tiporevista = entrada.nextLine(); 
        System.out.println("Ingresa el precio de la revista:");
        precio = entrada.nextFloat();
       
    }
    
}
