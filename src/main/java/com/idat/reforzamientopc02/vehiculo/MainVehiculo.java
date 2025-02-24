/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.vehiculo;

/**
 *
 * @author Solaris
 */
public class MainVehiculo {
    
    public static void main(String[] args) {
        
        Vehiculo vehiculo = new Vehiculo("Toyota Corolla",155.50);
        vehiculo.calcularAlquiler(5);
        vehiculo.mostrarInfo(5);
        
    }
    
}
