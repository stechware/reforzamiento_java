/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.rectangulo;

/**
 *
 * @author Solaris
 */
public class Rectangulo {
    
    private float base;
    
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calculaArea(){
        return base*altura;
    }
    
    public float calculaPerimetro(){
        return 2*base + 2*altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", Area ="+calculaArea()+" , Perimetro = "+ calculaPerimetro()+ '}';
    }
    
    
     
}
