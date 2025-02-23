/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.empresa_software;

/**
 *
 * @author Solaris
 */
public class MainEmpresa {
    
    public static void main(String[] args) {
        
        Empresa empresa = new Empresa();
        
        empresa.venta('G', 2);
        empresa.venta('S', 1);
        empresa.venta('B', 5);
        empresa.venta('C', 7);
        empresa.venta('G', 2);
        
    }
    
}
