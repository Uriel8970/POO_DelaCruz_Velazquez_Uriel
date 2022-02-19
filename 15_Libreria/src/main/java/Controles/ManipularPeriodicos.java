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

public class ManipularPeriodicos implements Serializable {
    
    private ArrayList<Periodico> listadeperiodicos;    
    private ArchivoP objetoarchivoperiodicos = new ArchivoP();
    
    public ManipularPeriodicos(){
        listadeperiodicos = new ArrayList<Periodico>();
        listadeperiodicos = objetoarchivoperiodicos.leer();
    }

    public void agregarPeriodico(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';

        while(resp == 's'){
            Periodico objperiodicos = new Periodico();
            objperiodicos.aceptarDatos();
            listadeperiodicos.add(objperiodicos);
            System.out.println("¿Deseas agregar otro periodico?");
            resp = entrada.next().charAt(0);
        }
    }
      
    public void consultaGeneral(){
        
        if(listadeperiodicos.isEmpty()){
            System.out.println("No hay periodicos agregados");
        }else{
            System.out.println("Los periodicos son:");
            for(int i = 0; i < listadeperiodicos.size(); i++){
                System.out.println("Nombre del Periodico: " + listadeperiodicos.get(i).getNombre()+"\n");                
                System.out.println("Autor del Periodico: " + listadeperiodicos.get(i).getAutor()+"\n");
                System.out.println("Editorial del Periodico: " + listadeperiodicos.get(i).getEditorial()+"\n");
                System.out.println("Precio del Periodico: " + listadeperiodicos.get(i).getPrecio()+"\n");
                System.out.println("Fecha de publicacion: " + listadeperiodicos.get(i).getFecha()+"\n");

            }
        }
    }
    
    private int traePosicion (String buscarNombre){
        int pos = 0;
        boolean existe = false;

        for(int i = 0; i < listadeperiodicos.size(); i++){
           
            if(buscarNombre.equalsIgnoreCase(listadeperiodicos.get(i).getNombre())){
                //si lo encuentra
                pos = i;
                existe = true;
            }else{
                System.out.println("Periodico no encontrado. Favor de ponerse en contacto con el admin");
            }
        }
        
        if(!existe){
            //porque esta fuera del arreglo o la lista osea no existe
            System.out.println("No existe registro del Periodico");
            pos = -1;
        }
        return pos;
    }
     
    public int buscar(){
        int posbuscar = 0;
        String nombreBuscar;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del periodico que desea buscar");
        nombreBuscar = entrada.nextLine();
        
        posbuscar = traePosicion(nombreBuscar);
        
        System.out.println("Fecha de publicacion: " + listadeperiodicos.get(posbuscar).getFecha());
        System.out.println("Nombre del Periodico: " + listadeperiodicos.get(posbuscar).getNombre());
        System.out.println("Autor del Periodico: " + listadeperiodicos.get(posbuscar).getAutor());
        System.out.println("Editorial del Periodico: " + listadeperiodicos.get(posbuscar).getEditorial());
        System.out.println("Precio del Periodico: " + listadeperiodicos.get(posbuscar).getPrecio());
        
        return posbuscar;
    }
       
    public void borrar(){
        Scanner entrada = new Scanner(System.in);
        String periodicoborrar;
        int posborrar;
        
        if(listadeperiodicos.isEmpty()){
            System.out.println("No hay periodicos registrados");
        }else{
            System.out.println("Ingresa el nombre del periodico  que vas a eliminar: ");
            posborrar = buscar();
            
            if(posborrar < listadeperiodicos.size()){
                listadeperiodicos.remove(posborrar);
                System.out.println("Periodico eliminado");
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
        
        System.out.println("Ingresa el nombre del Periodico que deseas modificar: ");
        modificar = entrada.nextLine();
               
        while("s".equalsIgnoreCase(opcion)){
            posmodificar = traePosicion(modificar);
            
            //ya se obtuvieron los datos
            System.out.println("¿Que dato deseas modificar del Periodico?"
                    + "\n 1.- Autor. "
                    + "\n 2.- Editorial"
                    + "\n 3.- Precio"
                    + "\n 4.- Fecha de publicacion"
                    + "\n");
            
            resmod = entrada.nextInt();
            
            switch (resmod) {
                case 1:
                    //autor
                    System.out.println("El autor es: ");
                    System.out.println("Autor: " + listadeperiodicos.get(posmodificar).getAutor());
                    System.out.println("Ingresa el nuevo autor");
                    listadeperiodicos.get(posmodificar).setAutor(entrada.next());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Autor: " + listadeperiodicos.get(posmodificar).getAutor());
                    
                    break;
                    
                case 2:
                    //editorial
                    System.out.println("La editorial es: ");
                    System.out.println("Editorial: " + listadeperiodicos.get(posmodificar).getEditorial());
                    System.out.println("Ingresa la nueva editorial");
                    listadeperiodicos.get(posmodificar).setEditorial(entrada.next());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Editorial: " + listadeperiodicos.get(posmodificar).getEditorial());
                    
                    break;
                
                case 3: 
                    //precio
                    System.out.println("El precio es: ");
                    System.out.println("Precio: " + listadeperiodicos.get(posmodificar).getPrecio());
                    System.out.println("Ingresa el nuevo precio");
                    listadeperiodicos.get(posmodificar).setPrecio(entrada.nextFloat());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Precio: " + listadeperiodicos.get(posmodificar).getPrecio());
                    
                    break;
                case 4:
                    //fecha de publicacion
                    System.out.println("La fecha de publicacion es:");
                    System.out.println("fecha de publicacion: " + listadeperiodicos.get(posmodificar).getFecha());
                    System.out.println("Ingresa la nueva editorial");
                    listadeperiodicos.get(posmodificar).setFecha2(entrada.next());
                    System.out.println("El dato a sido modificado");
                    System.out.println("La fecha de publicacion es: " + listadeperiodicos.get(posmodificar).getFecha());
                    
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
        getObjetoarchivoperiodicos().serializar(listadeperiodicos);
    }

    public ArrayList<Periodico> getListadelibros() {
        return listadeperiodicos;
    }

    public void setListadelibros(ArrayList<Periodico> listadelibros) {
        this.listadeperiodicos = listadelibros;
    }

    public ArchivoP getObjetoarchivoperiodicos() {
        return objetoarchivoperiodicos;
    }

    public void setObjetoarchivoperiodicos(ArchivoP objetoarchivolibros) {
        this.objetoarchivoperiodicos= objetoarchivoperiodicos;
    }

    public void buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
