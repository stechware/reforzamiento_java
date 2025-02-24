/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.vehiculo;

/**
 *
 * @author Solaris
 */
public class AutoLujo extends Vehiculo{
    
    
    public AutoLujo(String marca, double tarifaDiaria) {
        super(marca, tarifaDiaria);
    }

    @Override
    public double calcularAlquiler(int cantidadDias) {
        
        return super.calcularAlquiler(cantidadDias) * 1.20; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
    }

    @Override
    public void mostrarInfo(int cantidadDias) {
        //super.mostrarInfo(cantidadDias); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Metodo mostrarInfo de AutoLujo");
        System.out.println("El nombre del Vehiculo : " + super.getMarca());
        System.out.println("El costo del Alquiler : " + calcularAlquiler(cantidadDias));
    }    
}
