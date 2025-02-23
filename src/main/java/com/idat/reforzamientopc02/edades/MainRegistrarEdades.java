/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.edades;

import java.util.Scanner;

/**
 *
 * @author Solaris
 */
public class MainRegistrarEdades {
    
    public static void main(String[] args) {
        
        RegistrarEdades edades = new RegistrarEdades();
        Scanner scanner = new Scanner(System.in);
        int edad;
        boolean bandera=true;
        
        /*
        registro.registrar(20);
        registro.registrar(10);
        registro.registrar(5);
        registro.registrar(18);
        registro.registrar(30);
        */
        do{
            System.out.println("Para Salir ingrese 0 ");
            System.out.print("Ingrese la edad. Considere rango entre 1 y 120 = ");
            edad = scanner.nextInt();
            if (edad < 0 || edad > 120){
                System.out.println("Edad incorrecta . Volver a ingresar la edad."); 
                continue;
            }
            if(edad == 0){
                bandera = false;
            }else{
                edades.registrar(edad);
            }
             
        }while(bandera);
        
        scanner.close();
    }  
}
