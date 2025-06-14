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
            System.out.println("Hola putitos");
            System.out.println("3 para salir");

            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
   
                        break;  
                    case 2:
    
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

