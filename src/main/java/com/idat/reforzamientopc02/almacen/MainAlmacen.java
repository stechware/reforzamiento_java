/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.almacen;

import static com.idat.reforzamientopc02.almacen.Constantes.*;
import java.util.Scanner;

/**
 *
 * @author Solaris
 */

public class MainAlmacen {

    public static void main(String[] args) {

        Almacen almacen = new Almacen();
        int opcion;
        int cantidadBolsas;

//        almacen.imprimirValores();
//        almacen.retiro(100);
//        almacen.imprimirValores();
//        almacen.deposito(2500);
//        almacen.imprimirValores();
//        almacen.deposito(500);
//        almacen.imprimirValores();
//        almacen.retiro(800);
//        almacen.imprimirValores();
//        almacen.deposito(400);
//        almacen.imprimirValores();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Ingresar Opción [1]Deposito [2]Retiro [3]Salir :");
            opcion = scanner.nextInt();
            if (opcion == SALIR ) {
                System.out.println("Saliendo del programa...");
                break;
            }
//            if(opcion == 1 || opcion == 2){
//                System.out.print("Ingresar la cantidad de bolsas :");
//                cantidadBolsas = scanner.nextInt();
//                if (opcion == 1) {
//                    almacen.deposito(cantidadBolsas);
//                } else {
//                    if (opcion == 2) {
//                        almacen.retiro(cantidadBolsas);
//                    }
//                }
                switch (opcion){
                    case RETIRO:
                        System.out.print("Ingresar la cantidad de bolsas a Retirar :");
                        cantidadBolsas = scanner.nextInt();
                        almacen.retiro(cantidadBolsas);
                        break;
                    case DEPOSITO:
                        System.out.print("Ingresar la cantidad de bolsas a Depositar :");
                        cantidadBolsas = scanner.nextInt();
                        almacen.deposito(cantidadBolsas);
                        break;
                    default:
                        System.out.println("Opcion Incorrecta...");
                        continue;
                }
//                System.out.print("Ingresar la cantidad de bolsas :");
//                cantidadBolsas = scanner.nextInt();
//            }else{
//                System.out.println("Opcion Incorrecta...");
//            }
        } while(opcion != RETIRO || opcion != DEPOSITO );
    }
}
