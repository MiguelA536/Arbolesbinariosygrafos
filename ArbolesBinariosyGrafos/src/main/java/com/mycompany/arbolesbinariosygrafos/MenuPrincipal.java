/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesbinariosygrafos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class MenuPrincipal {
        public void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        
        do {
            
            System.out.println("\n__Aquí estan las actividades de hoy__");
            System.out.println("1.- Para ver lo relacionado al Arbol binario");
            System.out.println("2.- Para ver el programa relacionado al grafo");
            System.out.println("3 para salir");

            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        App app1 = new App();
                        app1.ejecutar1();
                        break;  
                    case 2:
                        App2 app2 = new App2();
                        app2.ejecutar2();
                        break;
                    case 3:
                        System.out.println("Hasta luego");
                        break;
                          
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número entero.");
                entrada.next();
                opcion = 0;
            }
        } while (opcion != 3);
    }
}

