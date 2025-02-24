/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.vehiculo;

/**
 *
 * @author Solaris
 */
public class Vehiculo {
    
    private String marca;
    private double tarifaDiaria;

    public Vehiculo(String marca, double tarifaDiaria) {
        this.marca = marca;
        this.tarifaDiaria = tarifaDiaria;
    }
    
    public double calcularAlquiler(int cantidadDias){
        
        return tarifaDiaria * cantidadDias;
    }
    
    public void mostrarInfo(int cantidadDias){
        System.out.println("Metodo mostrarInfo de Vehiculo");
        System.out.println("El nombre del Vehiculo : " + this.marca);
        System.out.println("El costo del Alquiler : " + (this.tarifaDiaria * cantidadDias));
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void setTarifaDiaria(double tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Marca=" + marca + ", tarifaDiaria=" + tarifaDiaria + '}';
    }
    
}
