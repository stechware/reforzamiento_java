/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

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
       System.out.print("Ingrese el Producto a Vender [A],[B] o [C] : ");
       tipoProducto =scanner.next().charAt(0);
       System.out.print("Ingrese la cantidad a comprar : ");
       cantidadProductos = scanner.nextInt();
       tienda.venta(tipoProducto, cantidadProductos);
       tienda.reporte();
       scanner.close();
        
    }
    
}
