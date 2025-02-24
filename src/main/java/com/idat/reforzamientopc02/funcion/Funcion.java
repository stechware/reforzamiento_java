/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.funcion;

/**
 *
 * @author Solaris
 */
public class Funcion {
    
    private double x ;
    private double y;

    public Funcion() {
        this.x = 0;
        this.y = 0;
    }
    
    public double calcularValorY(double x){
        
        double y;
        
        y = (Math.pow(x,3) + 3*x + 1)/(Math.pow(x, 2) + 2);
        
        return y;
    
    }
    
    public void imprimir(){
        
        System.out.println("x       y");
        
        for(double x=0; x<=10; x += 0.25){
            System.out.print(x);
            System.out.print("\t");
            //System.out.println(calcularValorY(x));
            System.out.println(String.format("%.2f",calcularValorY(x)));
        }  
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Funcion{" + "x=" + x + ", y=" + y + '}';
    }
     
}
