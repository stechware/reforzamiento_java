/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.banco;

/**
 *
 * @author Solaris
 */
public class Cliente {
    
    private String  nombre;
    private String apellido;
    private String dni;
    private int edad;
    private double saldo;

    public Cliente(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.saldo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposito(double montoDepositado){
        
        if (montoDepositado <=0){
            System.out.println("Monto No Valido Para depósito...");
            return;
        }
        saldo += montoDepositado;
        System.out.println("Cliente : "+nombre + " "+apellido+" depositó S/. " + montoDepositado);
    }
    
    public void retiro(double montoRetirado){
        
        if(montoRetirado == 0 || montoRetirado>saldo){
           System.out.println("Monto No Valido Para retiro...");
           return;
        }
        saldo -= montoRetirado;
        System.out.println("Cliente : "+nombre + " "+apellido+" retiró S/. " + montoRetirado);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + ", saldo=" + saldo + '}';
    }
    
    
}
