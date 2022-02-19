/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

/**
 *
 * @author Dell
 */

import Documentos.CLibro;
import java.util.*;
import java.io.*;

public class ArchivoL implements Serializable {
    
    /*
    vamos a crear el objeto que vamos a serializar 
    de la lista de los libros
    */
    
    ArrayList<CLibro> listarecuperada = new ArrayList<CLibro>();
    
    //metodo para generar la lectura del archivo
    //metodo que lee el archivo
    public ArrayList<CLibro> leer(){
        try{
            //primero tenemos que crear la lectura del buffer de objetos
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("libro.txt"));
            listarecuperada = (ArrayList<CLibro>)in.readObject();
            in.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Se origino :" + e.getStackTrace());
        }
        return listarecuperada;
    }
    
    //el metodo que serializa
    //metodo que escribe el archivo
    void serializar(ArrayList<CLibro> listaserializada){
        try{
            //generar el archivo de salida
            FileOutputStream salida = new FileOutputStream("libro.txt");
            //generar la creacion de los objetos
            ObjectOutputStream salidaobjeto = new ObjectOutputStream(salida);
            
            //ya que tengo la generacion de la salida la escribimos
            
            salidaobjeto.writeObject(listaserializada);
            
            salidaobjeto.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Se origino :" + e.getStackTrace());
        }
    }
    
}
