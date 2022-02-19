/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

/**
 *
 * @author Dell
 */

import Documentos.Periodico;
import java.util.*;
import java.io.*;

public class ArchivoP implements Serializable {
    
    ArrayList<Periodico> listarecuperada = new ArrayList<Periodico>();
    
    public ArrayList<Periodico> leer(){
        try{
            //primero tenemos que crear la lectura del buffer de objetos
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("periodico.txt"));
            listarecuperada = (ArrayList<Periodico>)in.readObject();
            in.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Se origino :" + e.getStackTrace());
        }
        return listarecuperada;
    }
    
    void serializar(ArrayList<Periodico> listaserializada){
        try{
            FileOutputStream salida = new FileOutputStream("periodico.txt");
            ObjectOutputStream salidaobjeto = new ObjectOutputStream(salida);
            salidaobjeto.writeObject(listaserializada);            
            salidaobjeto.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Se origino :" + e.getStackTrace());
        }
    }   
    
}
