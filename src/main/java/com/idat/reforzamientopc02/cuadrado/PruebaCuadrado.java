/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.cuadrado;

/**
 *
 * @author Solaris
 */
public class PruebaCuadrado {
    
    public static void main(String[] args) {
        
        final char caracter='x';
        
        Cuadrado cuadrado = new Cuadrado(5);
        cuadrado.imprimir(caracter);
        cuadrado.setLado(10);
        cuadrado.imprimir(caracter);
        cuadrado.setLado(5);
        System.out.println(cuadrado.imprimirCuadrado());
        
    }
    
}
