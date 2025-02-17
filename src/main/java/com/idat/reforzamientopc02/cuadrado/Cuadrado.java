/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.cuadrado;

/**
 *
 * @author Solaris
 */
public class Cuadrado {
    
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    /*
    public void imprimir(){
        
        for(int i=0; i < lado;  i++){
            System.out.print("*");
        }
        System.out.print("\n");
        for(int i=1; i < lado -1 ; i++){
            //System.out.println("*");
            System.out.print("*");
            for (int j=1; j < lado-1; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=0; i< lado;  i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }*/
    
    public void imprimir(char caracter){
        
        for(int i=0; i < lado;  i++){
            System.out.print(caracter);
        }
        System.out.print("\n");
        for(int i=1; i < lado -1 ; i++){
            //System.out.println("*");
            System.out.print(caracter);
            for (int j=1; j < lado-1; j++){
                System.out.print(" ");
            }
            System.out.println(caracter);
        }
        for(int i=0; i< lado;  i++){
            System.out.print(caracter);
        }
        System.out.print("\n");
    }
    
    public String imprimirCuadrado() {
    
    int i, espacios;
    String resultado = "";

    for (i = 0; i < this.lado; i++) {
      resultado += "██";
    }
    resultado += "\n";

    for (i = 1; i < this.lado - 1; i++) {
      resultado += "██";
      for (espacios = 1; espacios < this.lado - 1; espacios++) {
        resultado += "  ";
      }
      resultado += "██\n";
    }
        
    for (i = 0; i < this.lado; i++) {
      resultado += "██";
    }
    resultado += "\n";
    
    return resultado;
  }
    
    
}
