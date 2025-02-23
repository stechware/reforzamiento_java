/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import static tienda.Constantes.*;

/**
 *
 * @author Solaris
 */
public class Tienda {
    
    private double importePagar;
    private int numeroVentasProductoA;
    private int numeroVentasProductoB;
    private int numeroVentasProductoC;
    private double totalRecaudadoProductoA;
    private double totalRecaudadoProductoB;
    private double totalRecaudadoProductoC;

    public Tienda() {
        this.importePagar = 0;
        this.numeroVentasProductoA = 0;
        this.numeroVentasProductoB = 0;
        this.numeroVentasProductoC = 0;
        this.totalRecaudadoProductoA = 0;
        this.totalRecaudadoProductoB = 0;
        this.totalRecaudadoProductoC = 0;
    }
    
    public void venta(char tipoProducto, int cantidadProductos){
        if(tipoProducto == TIPO_PRODUCTO_A){
            this.importePagar = cantidadProductos*21.5;
            this.numeroVentasProductoA++;
            this.totalRecaudadoProductoA +=this.importePagar;
        }else{
            if(tipoProducto == TIPO_PRODUCTO_B){
                this.importePagar = cantidadProductos*30;
                this.numeroVentasProductoB++;
                this.totalRecaudadoProductoB +=this.importePagar;
            }
            else{
                this.importePagar = cantidadProductos*30;
                this.numeroVentasProductoC++;
                this.totalRecaudadoProductoC +=this.importePagar;
            }
        }    
    }
    
    public void reporte(){
    
        System.out.println("El importe a pagar : "+this.importePagar);
        System.out.println("Número de ventas efectuadas del producto A : " + numeroVentasProductoA);
        System.out.println("Número de ventas efectuadas del producto B : " + numeroVentasProductoB);
        System.out.println("Número de ventas efectuadas del producto B : " + numeroVentasProductoC);
        System.out.println("Importe total recaudado del producto A     : " + totalRecaudadoProductoA);
        System.out.println("Importe total recaudado del producto B     : " + totalRecaudadoProductoB);
        System.out.println("Importe total recaudado del producto C     : " + totalRecaudadoProductoC);
        
    }
    
    
    public double getImportePagar() {
        return importePagar;
    }

    public void setImportePagar(double importePagar) {
        this.importePagar = importePagar;
    }

    public int getNumeroVentasProductoA() {
        return numeroVentasProductoA;
    }

    public void setNumeroVentasProductoA(int numeroVentasProductoA) {
        this.numeroVentasProductoA = numeroVentasProductoA;
    }

    public int getNumeroVentasProductoB() {
        return numeroVentasProductoB;
    }

    public void setNumeroVentasProductoB(int numeroVentasProductoB) {
        this.numeroVentasProductoB = numeroVentasProductoB;
    }

    public int getNumeroVentasProductoC() {
        return numeroVentasProductoC;
    }

    public void setNumeroVentasProductoC(int numeroVentasProductoC) {
        this.numeroVentasProductoC = numeroVentasProductoC;
    }

    public double getTotalRecaudadoProductoA() {
        return totalRecaudadoProductoA;
    }

    public void setTotalRecaudadoProductoA(double totalRecaudadoProductoA) {
        this.totalRecaudadoProductoA = totalRecaudadoProductoA;
    }

    public double getTotalRecaudadoProductoB() {
        return totalRecaudadoProductoB;
    }

    public void setTotalRecaudadoProductoB(double totalRecaudadoProductoB) {
        this.totalRecaudadoProductoB = totalRecaudadoProductoB;
    }

    public double getTotalRecaudadoProductoC() {
        return totalRecaudadoProductoC;
    }

    public void setTotalRecaudadoProductoC(double totalRecaudadoProductoC) {
        this.totalRecaudadoProductoC = totalRecaudadoProductoC;
    }

    @Override
    public String toString() {
        return "Tienda{" + "importePagar=" + importePagar + ", numeroVentasProductoA=" + numeroVentasProductoA + ", numeroVentasProductoB=" + numeroVentasProductoB + ", numeroVentasProductoC=" + numeroVentasProductoC + ", totalRecaudadoProductoA=" + totalRecaudadoProductoA + ", totalRecaudadoProductoB=" + totalRecaudadoProductoB + ", totalRecaudadoProductoC=" + totalRecaudadoProductoC + '}';
    }  
}
