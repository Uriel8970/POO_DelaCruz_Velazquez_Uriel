/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

/**
 *
 * @author Dell
 */

import Documentos.Revista;
import java.util.*;
import java.io.*;

public class ArchivoR implements Serializable {
    
    ArrayList<Revista> listarecuperada = new ArrayList<Revista>();
 
    public ArrayList<Revista> leer(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("revista.txt"));
            listarecuperada = (ArrayList<Revista>)in.readObject();
            in.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Se origino :" + e.getStackTrace());
        }
        return listarecuperada;
    }
    void serializar(ArrayList<Revista> listaserializada){
        try{
            FileOutputStream salida = new FileOutputStream("revista.txt");
            ObjectOutputStream salidaobjeto = new ObjectOutputStream(salida);
            salidaobjeto.writeObject(listaserializada);            
            salidaobjeto.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Se origino :" + e.getStackTrace());
        }
    }
    
}
