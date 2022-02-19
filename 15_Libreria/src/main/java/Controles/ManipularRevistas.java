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

public class ManipularRevistas implements Serializable {
    
    private ArrayList<Revista> listaderevistas;
    private ArchivoR objetoarchivorevistas = new ArchivoR();

    public ManipularRevistas(){
        listaderevistas = new ArrayList<Revista>();
        listaderevistas = objetoarchivorevistas.leer();
    }

    public void agregarRevista(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        while(resp == 's'){
            Revista objrevistas = new Revista();
            objrevistas.aceptarDatos();
            listaderevistas.add(objrevistas);
            System.out.println("¿Deseas agregar otra revista?");
            resp = entrada.next().charAt(0);
        }
    }
    
    public void consultaGeneral(){ 
        if(listaderevistas.isEmpty()){
            System.out.println("No hay revistas agregadas");
        }else{
            System.out.println("Las revistas son:");
            for(int i = 0; i < listaderevistas.size(); i++){
                System.out.println("Tipo de Revista : " + listaderevistas.get(i).getTiporevista()+"\n");
                System.out.println("Nombre de la Revista: " + listaderevistas.get(i).getNombre()+"\n");
                System.out.println("Autor de la Revista: " + listaderevistas.get(i).getAutor()+"\n");
                System.out.println("Editorial de la Revista: " + listaderevistas.get(i).getEditorial()+"\n");
                System.out.println("Precio de la Revista: " + listaderevistas.get(i).getPrecio()+"\n");
            }
        }
    }
    
    private int traePosicion (String buscarNombre){
        int pos = 0;
        boolean existe = false;

        for(int i = 0; i < listaderevistas.size(); i++){
           
            if(buscarNombre.equalsIgnoreCase(listaderevistas.get(i).getNombre())){
                pos = i;
                existe = true;
            }else{
                System.out.println("Revista no encontrada. Favor de ponerse en contacto con el admin");
            }
        }
        
        if(!existe){
            System.out.println("No existe registro de la Revista");
            pos = -1;
        }
        return pos;
    }
    
    public int buscar(){
        int posbuscar = 0;
        String nombreBuscar;
        Scanner entrada = new Scanner(System.in);       
        System.out.println("Ingresa el nombre de la revista que desea buscar");
        nombreBuscar = entrada.nextLine();        
        posbuscar = traePosicion(nombreBuscar);        
        System.out.println("Tipo de Revista: " + listaderevistas.get(posbuscar).getTiporevista());
        System.out.println("Nombre de la Revista: " + listaderevistas.get(posbuscar).getNombre());
        System.out.println("Autor de la Revista: " + listaderevistas.get(posbuscar).getAutor());
        System.out.println("Editorial de la Revista: " + listaderevistas.get(posbuscar).getEditorial());
        System.out.println("Precio de la Revista : " + listaderevistas.get(posbuscar).getPrecio());
        
        return posbuscar;
    }
       
    public void borrar(){        
        Scanner entrada = new Scanner(System.in);       
        String revistaborrar;
        int posborrar;    
        if(listaderevistas.isEmpty()){
            System.out.println("No hay revistas registradas");
        }else{
            System.out.println("Ingresa el nombre de la revista  que vas a eliminar: ");
            posborrar = buscar();
            
            if(posborrar < listaderevistas.size()){
                listaderevistas.remove(posborrar);
                System.out.println("Revista eliminada");
            }else{
                System.out.println("Imposible elminar ese registro");
            }
        }            
    }  
    public void modificar(){
        int posmodificar = 0;
        int resmod = 0;
        String modificar;
        String opcion = "s";
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre de la revista que deseas modificar: ");
        modificar = entrada.nextLine();
               
        while("s".equalsIgnoreCase(opcion)){
            posmodificar = traePosicion(modificar);
            
            System.out.println("¿Que dato deseas modificar de la Revista?"
                    + "\n 1.- Autor. "
                    + "\n 2.- Editorial"
                    + "\n 3.- Precio"
                    + "\n 4.- Tipo de Revista"
                    + "\n");
            
            resmod = entrada.nextInt();
            
            switch (resmod) {
                case 1:
                    //autor
                    System.out.println("El autor es: ");
                    System.out.println("Autor: " + listaderevistas.get(posmodificar).getAutor());
                    System.out.println("Ingresa el nuevo autor");
                    listaderevistas.get(posmodificar).setAutor(entrada.next());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Autor: " + listaderevistas.get(posmodificar).getAutor());
                    
                    break;
                    
                case 2:
                    //editorial
                    System.out.println("La editorial es: ");
                    System.out.println("Editorial: " + listaderevistas.get(posmodificar).getEditorial());
                    System.out.println("Ingresa la nueva editorial");
                    listaderevistas.get(posmodificar).setEditorial(entrada.next());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Editorial: " + listaderevistas.get(posmodificar).getEditorial());
                    
                    break;
                
                case 3: 
                    //precio
                    System.out.println("El precio es: ");
                    System.out.println("Precio: " + listaderevistas.get(posmodificar).getPrecio());
                    System.out.println("Ingresa el nuevo costo");
                    listaderevistas.get(posmodificar).setPrecio(entrada.nextFloat());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Precio: " + listaderevistas.get(posmodificar).getPrecio());
                    
                    break;
                case 4:
                    //tipo de revista
                    System.out.println("El tipo de revista es:");
                    System.out.println("Tipo de revista: " + listaderevistas.get(posmodificar).getTiporevista());
                    System.out.println("Ingresa el nuevo tipo de revista");
                    listaderevistas.get(posmodificar).setTiporevista(entrada.next());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Tipo de revista: " + listaderevistas.get(posmodificar).getTiporevista());
                    
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("¿Quieres cambiar algun otro dato s/n?");
            opcion = entrada.nextLine();
        }
    }
    
    
    public void grabar(){
        //mandando a llamar a que se cree el archivo
        getObjetoarchivorevistas().serializar(listaderevistas);
    }

    public ArrayList<Revista> getListaderevistas() {
        return listaderevistas;
    }

    public void setListaderevistas(ArrayList<Revista> listaderevistas) {
        this.listaderevistas = listaderevistas;
    }

    public ArchivoR getObjetoarchivorevistas() {
        return objetoarchivorevistas;
    }

    public void setObjetoarchivorevistas(ArchivoR objetoarchivorevistas) {
        this.objetoarchivorevistas= objetoarchivorevistas;
    }

    public void agregarRevista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
