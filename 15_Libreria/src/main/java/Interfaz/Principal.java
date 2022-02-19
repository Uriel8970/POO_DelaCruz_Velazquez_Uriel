/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

/**
 *
 * @author Dell
 */

import Controles.ManipularLibros;
import Controles.ManipularPeriodicos;
import Controles.ManipularRevistas;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        //menu prinicipal para poder manipular los datos del libros y
        //de los demas documentos
        
        //instancia de ManipularLibros
        
        ManipularLibros listadelibrosobj = new ManipularLibros();
        ManipularRevistas listaderevistasobj = new ManipularRevistas();
        ManipularPeriodicos listadeperiodicosobj = new ManipularPeriodicos();

        
        int opcion;
        int opcion1;
        int opcion2;
        int opcion3;
        
        do{
            System.out.println("Bienvenido a la Bliblioteca ");
            System.out.println("Uriel De la Cruz Velazquez");
            System.out.println("Grupo 15");
            System.out.println("Ingrese la opcion deseada:");
            System.out.println("1.- Gestionar Libros");
            System.out.println("2.- Gestionar Revistas");
            System.out.println("3.- Gestionar Periodicos");
            System.out.println("4.- Salir");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("1.- Agregar nuevo Libro");
                        System.out.println("2.- Consultar Libro");
                        System.out.println("3.- Consultar todos los libros");
                        System.out.println("4.- Borrar un libro");
                        System.out.println("5.- Modificar los datos de un libro");
                        System.out.println("6.- Salir");

                        opcion1 = entrada.nextInt();

                        switch (opcion1){
                            case 1:
                                listadelibrosobj.agregarLibro();
                                break;
                            case 2:
                                listadelibrosobj.buscar();
                                break;
                            case 3:
                                listadelibrosobj.consultaGeneral();
                                break;
                            case 4:
                                listadelibrosobj.borrar();
                                break;
                            case 5:
                                listadelibrosobj.modificar();
                                break;
                            case 6:
                                System.out.println("Adios :3");

                        default:
                         System.out.println("Error ingrese una opcion valida");
                        }        
                    }while((opcion1 >= 1)&&(opcion1 < 6));
                case 2:
                    do{
                        System.out.println("1.- Agregar nueva Revista");
                        System.out.println("2.- Consultar Revista");
                        System.out.println("3.- Consultar todas las revistas");
                        System.out.println("4.- Borrar una revista");
                        System.out.println("5.- Modificar los datos de una revista");
                        System.out.println("6.- Salir");

                        opcion2 = entrada.nextInt();

                        switch (opcion2){
                            case 1:
                                listaderevistasobj.agregarRevista();
                                break;
                            case 2:
                                listaderevistasobj.buscar();
                                break;
                            case 3:
                                listaderevistasobj.consultaGeneral();
                                break;
                            case 4:
                                listaderevistasobj.borrar();
                                break;
                            case 5:
                                listaderevistasobj.modificar();
                                break;
                            case 6:
                                System.out.println("Adios");
                        default:
                         System.out.println("Error ingrese una opcion valida");
                        }
                    }while((opcion2 >= 1)&&(opcion2 < 6));


                case 3: 
                    do{
                        System.out.println("1.- Agregar nuevo periodico");
                        System.out.println("2.- Consultar Periodico");
                        System.out.println("3.- Consultar todos los periodicos");
                        System.out.println("4.- Borrar un periodico");
                        System.out.println("5.- Modificar los datos de un periodico");
                        System.out.println("6.- Salir");

                        opcion3 = entrada.nextInt();

                        switch(opcion3){
                            case 1:
                                listadeperiodicosobj.agregarPeriodico();
                                break;
                            case 2:
                                listadeperiodicosobj.buscar();
                                break;
                            case 3:
                                listadeperiodicosobj.consultaGeneral();
                                break;
                            case 4:
                                listadeperiodicosobj.borrar();
                                break;                                     
                            case 5:
                                listadeperiodicosobj.modificar();
                                break;
                            case 6:
                                System.out.println("Adios");
                        default:
                         System.out.println("Error ingrese una opcion valida");
                        }
                    }while((opcion3 >= 1)&&(opcion3 < 6));
               
                case 4:
                    System.out.println("Adios gracias por su alma");
                    //cuando vamos a generar el archivo
                    listadelibrosobj.grabar();
                default:
                    System.out.println("Error ingrese una opcion valida");
            }
        
        }while((opcion >= 1)&&(opcion < 4));
    }
    
}
