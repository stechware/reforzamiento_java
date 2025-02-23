/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.edades;

/**
 *
 * @author Solaris
 */
public class RegistrarEdades {
    
    private int numeroPersonasMayoresEdad;
    private int numeroPersonasMenoresEdad;
    private int mayorEdad;
    private int menorEdad;

    public RegistrarEdades() {
        this.numeroPersonasMayoresEdad = 0;
        this.numeroPersonasMenoresEdad = 0;
        this.mayorEdad = 0;
        this.menorEdad = 120;
    }
    
    public void registrar(int edad){
        
        if(edad >= 18){
            this.numeroPersonasMayoresEdad++;
        }else{
            this.numeroPersonasMenoresEdad++;
        }
        // Obtener la Mayor Edad
        if(edad > mayorEdad){
            this.mayorEdad = edad;
        }
        // Obtenet la Menor Edad
        if (edad < menorEdad){
            this.menorEdad = edad;
        }
        // Imprimir el reporte
        reporte();
    }
    
    public void reporte(){
        System.out.println("======================================================================");
        System.out.println(" El número de personas mayores de edad = " + numeroPersonasMayoresEdad);
        System.out.println(" El número de personas menores de edad = " + numeroPersonasMenoresEdad);
        System.out.println("La mayor edad ingresada = " + mayorEdad);
        System.out.println("La menor edad ingresada = " + menorEdad);
    }

    public int getNumeroPersonasMayoresEdad() {
        return numeroPersonasMayoresEdad;
    }

    public void setNumeroPersonasMayoresEdad(int numeroPersonasMayoresEdad) {
        this.numeroPersonasMayoresEdad = numeroPersonasMayoresEdad;
    }

    public int getNumeroPersonasMenoresEdad() {
        return numeroPersonasMenoresEdad;
    }

    public void setNumeroPersonasMenoresEdad(int numeroPersonasMenoresEdad) {
        this.numeroPersonasMenoresEdad = numeroPersonasMenoresEdad;
    }

    public int getMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(int mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public int getMenorEdad() {
        return menorEdad;
    }

    public void setMenorEdad(int menorEdad) {
        this.menorEdad = menorEdad;
    }

    @Override
    public String toString() {
        return "RegistrarEdades{" + "numeroPersonasMayoresEdad=" + numeroPersonasMayoresEdad + ", numeroPersonasMenoresEdad=" + numeroPersonasMenoresEdad + ", mayorEdad=" + mayorEdad + ", menorEdad=" + menorEdad + '}';
    }
    
     
}
