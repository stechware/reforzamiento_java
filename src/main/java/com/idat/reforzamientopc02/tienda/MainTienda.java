package com.idat.reforzamientopc02.tienda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import static com.idat.reforzamientopc02.tienda.Constantes.*;
import java.util.Scanner;


/**
 *
 * @author Solaris
 */
public class MainTienda {
    
    public static void main(String[] args) {

       char tipoProducto;
       int cantidadProductos;
       Tienda tienda = new Tienda();
       Scanner scanner = new Scanner(System.in);
       
       do{
            
            System.out.print("Ingrese el Producto a Vender [A],[B] y [C] .");
            System.out.print("Si desea Salir ingrese [S] :");
            tipoProducto =scanner.next().toUpperCase().charAt(0);
            
            if( tipoProducto != TIPO_PRODUCTO_A && 
                tipoProducto != TIPO_PRODUCTO_B && 
                tipoProducto != TIPO_PRODUCTO_C &&
                tipoProducto != OPCION_SALIR      ){
                
                System.out.println("Opción Incorrecta. Volver a ingresar tipo de Producto ...");
                continue;
            }
            if(tipoProducto != OPCION_SALIR){
                System.out.print("Ingrese la cantidad a comprar : ");
                cantidadProductos = scanner.nextInt();
                tienda.venta(tipoProducto, cantidadProductos);
                tienda.reporte();
            }  
       }while(tipoProducto!=OPCION_SALIR);
       
       scanner.close();
        
    }
    
}
