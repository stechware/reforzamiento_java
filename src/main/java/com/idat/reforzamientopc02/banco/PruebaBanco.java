/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.banco;

/**
 *
 * @author Solaris
 */
public class PruebaBanco {
    
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        banco.getCliente1().deposito(500);
        banco.getCliente2().deposito(1000);
        banco.getCliente3().deposito(700);

        banco.getCliente1().retiro(200);
        banco.getCliente2().retiro(300);
        banco.getCliente3().retiro(100);
        
        banco.mostrarClientes();
        banco.calcularTotalDepositos();
    }
    
}
