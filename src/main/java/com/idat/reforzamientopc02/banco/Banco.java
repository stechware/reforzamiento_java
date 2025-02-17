/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.banco;

/**
 *
 * @author Solaris
 */
public class Banco {
    
    private Cliente cliente1,cliente2,cliente3;
    
    public Banco() {

        this.cliente1 = new Cliente("Juan", "Perez", "12345678", 30);
        this.cliente2 = new Cliente("Maria", "Lopez", "87654321", 25);
        this.cliente3 = new Cliente("Carlos", "Garcia", "56781234", 35);
        
    }

    public Cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(Cliente cliente1) {
        this.cliente1 = cliente1;
    }

    public Cliente getCliente2() {
        return cliente2;
    }

    public void setCliente2(Cliente cliente2) {
        this.cliente2 = cliente2;
    }

    public Cliente getCliente3() {
        return cliente3;
    }

    public void setCliente3(Cliente cliente3) {
        this.cliente3 = cliente3;
    }
    
    // Método para calcular el dinero total en el banco
    public void calcularTotalDepositos() {
        double total = cliente1.getSaldo() + cliente2.getSaldo() + cliente3.getSaldo();
        System.out.println("El total de dinero depositado en el banco es: $" + total);
    }
    
    // Método para mostrar la información de los clientes
    public void mostrarClientes() {
        
        System.out.println("--- Información de los clientes ---");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(cliente3.toString());    

    }
    
}
