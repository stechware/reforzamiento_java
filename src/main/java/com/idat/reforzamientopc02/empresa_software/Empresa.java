/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.empresa_software;

import static com.idat.reforzamientopc02.empresa_software.Constantes.*;

/**
 *
 * @author Solaris
 */
public class Empresa {
    
    private double importeVenta;
    private double importeTotalLicenciaCobre;
    private double importeTotalLicenciaBronze;
    private double importeTotalLicenciaSilver;
    private double importeTotalLicenciaGold;
    private int numeroLicenciasVendidasCobre;
    private int numeroLicenciasVendidasBronze;
    private int numeroLicenciasVendidasSilver;
    private int numeroLicenciasVendidasGold;
    private int numeroVentasLicenciaCobre;
    private int numeroVentasLicenciaBronze;
    private int numeroVentasLicenciaSilver;
    private int numeroVentasLicenciaGold;

    public Empresa() {
        this.importeVenta = 0;
        this.importeTotalLicenciaCobre = 0;
        this.importeTotalLicenciaBronze = 0;
        this.importeTotalLicenciaSilver = 0;
        this.importeTotalLicenciaGold = 0;
        this.numeroLicenciasVendidasCobre = 0;
        this.numeroLicenciasVendidasBronze = 0;
        this.numeroLicenciasVendidasSilver = 0;
        this.numeroLicenciasVendidasGold = 0;
        this.numeroVentasLicenciaCobre = 0;
        this.numeroVentasLicenciaBronze = 0;
        this.numeroVentasLicenciaSilver = 0;
        this.numeroVentasLicenciaGold = 0;
    }
    
    public void venta(char tipoLicencia, int numeroLicencias){
        
        switch(tipoLicencia){
            
            case LICENCIA_COBRE:
                this.importeVenta = numeroLicencias * PRECIO_LICENCIA_COBRE;
                this.numeroLicenciasVendidasCobre += numeroLicencias;
                this.numeroVentasLicenciaCobre ++;
                break;
            case LICENCIA_BRONZE:
                this.importeVenta = numeroLicencias * PRECIO_LICENCIA_BRONZE;
                this.numeroLicenciasVendidasBronze += numeroLicencias;
                this.numeroVentasLicenciaBronze ++;
                break;
            case LICENCIA_SILVER:
                this.importeVenta =  numeroLicencias * PRECIO_LICENCIA_SILVER;
                this.numeroLicenciasVendidasSilver += numeroLicencias;
                this.numeroVentasLicenciaSilver ++;
                break;
            case LICENCIA_GOLD:
                this.importeVenta =  numeroLicencias * PRECIO_LICENCIA_GOLD;
                this.numeroVentasLicenciaGold ++;
                this.numeroLicenciasVendidasGold += numeroLicencias;
                break;    
            default:
                break;
        }
        System.out.println("============================================");
        System.out.println("            Venta Actual ");
        System.out.println("============================================");
        System.out.println("Tipo de licencia..........:" + getDescripcionLicencia(tipoLicencia));
        System.out.println("Número de licencias.......:" + numeroLicencias );
        System.out.println("Importe a pagar...........:" + this.importeVenta);
        reporte();
        
    }
    
    public void reporte(){
        System.out.println("============================================");
        System.out.println("            Reporte Histórico ");
        System.out.println("============================================");
        System.out.println("Número de licencias vendidas");
        System.out.println("    Por licencias Cobre....: " + numeroLicenciasVendidasCobre);
        System.out.println("    Por licencias Bronze...: " + numeroLicenciasVendidasBronze);
        System.out.println("    Por licencias Silver...: " + numeroLicenciasVendidasSilver);
        System.out.println("    Por licencias Gold.....: " + numeroLicenciasVendidasGold);
        System.out.println("");
        System.out.println("Número de ventas efectuadas");
        System.out.println("    Por licencias Cobre....: " + numeroVentasLicenciaCobre);
        System.out.println("    Por licencias Bronze...: " + numeroVentasLicenciaBronze);
        System.out.println("    Por licencias Silver...: " + numeroVentasLicenciaSilver);
        System.out.println("    Por licencias Gold.....: " + numeroVentasLicenciaGold);
    }
    
    public String getDescripcionLicencia(char tipoLicencia){
        
        String descripcionLicencia = "";
        
        switch(tipoLicencia){
            
            case LICENCIA_COBRE :
                descripcionLicencia = DESCRIPCION_LICENCIA_COBRE;
                break;
            case LICENCIA_BRONZE:
                descripcionLicencia = DESCRIPCION_LICENCIA_BRONZE;
                break;
            case LICENCIA_SILVER:
                descripcionLicencia = DESCRIPCION_LICENCIA_SILVER;
                break;
            case LICENCIA_GOLD:
                descripcionLicencia = DESCRIPCION_LICENCIA_GOLD;
                break;    
            default:
                break;
        }
        
        return descripcionLicencia;
        
    }

    public double getImporteVenta() {
        return importeVenta;
    }

    public void setImporteVenta(double importeVenta) {
        this.importeVenta = importeVenta;
    }

    public double getImporteTotalLicenciaCobre() {
        return importeTotalLicenciaCobre;
    }

    public void setImporteTotalLicenciaCobre(double importeTotalLicenciaCobre) {
        this.importeTotalLicenciaCobre = importeTotalLicenciaCobre;
    }

    public double getImporteTotalLicenciaBronze() {
        return importeTotalLicenciaBronze;
    }

    public void setImporteTotalLicenciaBronze(double importeTotalLicenciaBronze) {
        this.importeTotalLicenciaBronze = importeTotalLicenciaBronze;
    }

    public double getImporteTotalLicenciaSilver() {
        return importeTotalLicenciaSilver;
    }

    public void setImporteTotalLicenciaSilver(double importeTotalLicenciaSilver) {
        this.importeTotalLicenciaSilver = importeTotalLicenciaSilver;
    }

    public double getImporteTotalLicenciaGold() {
        return importeTotalLicenciaGold;
    }

    public void setImporteTotalLicenciaGold(double importeTotalLicenciaGold) {
        this.importeTotalLicenciaGold = importeTotalLicenciaGold;
    }

    public int getNumeroLicenciasVendidasCobre() {
        return numeroLicenciasVendidasCobre;
    }

    public void setNumeroLicenciasVendidasCobre(int numeroLicenciasVendidasCobre) {
        this.numeroLicenciasVendidasCobre = numeroLicenciasVendidasCobre;
    }

    public int getNumeroLicenciasVendidasBronze() {
        return numeroLicenciasVendidasBronze;
    }

    public void setNumeroLicenciasVendidasBronze(int numeroLicenciasVendidasBronze) {
        this.numeroLicenciasVendidasBronze = numeroLicenciasVendidasBronze;
    }

    public int getNumeroLicenciasVendidasSilver() {
        return numeroLicenciasVendidasSilver;
    }

    public void setNumeroLicenciasVendidasSilver(int numeroLicenciasVendidasSilver) {
        this.numeroLicenciasVendidasSilver = numeroLicenciasVendidasSilver;
    }

    public int getNumeroLicenciasVendidasGold() {
        return numeroLicenciasVendidasGold;
    }

    public void setNumeroLicenciasVendidasGold(int numeroLicenciasVendidasGold) {
        this.numeroLicenciasVendidasGold = numeroLicenciasVendidasGold;
    }

    public int getNumeroVentasLicenciaCobre() {
        return numeroVentasLicenciaCobre;
    }

    public void setNumeroVentasLicenciaCobre(int numeroVentasLicenciaCobre) {
        this.numeroVentasLicenciaCobre = numeroVentasLicenciaCobre;
    }

    public int getNumeroVentasLicenciaBronze() {
        return numeroVentasLicenciaBronze;
    }

    public void setNumeroVentasLicenciaBronze(int numeroVentasLicenciaBronze) {
        this.numeroVentasLicenciaBronze = numeroVentasLicenciaBronze;
    }

    public int getNumeroVentasLicenciaSilver() {
        return numeroVentasLicenciaSilver;
    }

    public void setNumeroVentasLicenciaSilver(int numeroVentasLicenciaSilver) {
        this.numeroVentasLicenciaSilver = numeroVentasLicenciaSilver;
    }

    public int getNumeroVentasLicenciaGold() {
        return numeroVentasLicenciaGold;
    }

    public void setNumeroVentasLicenciaGold(int numeroVentasLicenciaGold) {
        this.numeroVentasLicenciaGold = numeroVentasLicenciaGold;
    }

    @Override
    public String toString() {
        return "Empresa{" + "importeVenta=" + importeVenta + ", importeTotalLicenciaCobre=" + importeTotalLicenciaCobre + ", importeTotalLicenciaBronze=" + importeTotalLicenciaBronze + ", importeTotalLicenciaSilver=" + importeTotalLicenciaSilver + ", importeTotalLicenciaGold=" + importeTotalLicenciaGold + ", numeroLicenciasVendidasCobre=" + numeroLicenciasVendidasCobre + ", numeroLicenciasVendidasBronze=" + numeroLicenciasVendidasBronze + ", numeroLicenciasVendidasSilver=" + numeroLicenciasVendidasSilver + ", numeroLicenciasVendidasGold=" + numeroLicenciasVendidasGold + ", numeroVentasLicenciaCobre=" + numeroVentasLicenciaCobre + ", numeroVentasLicenciaBronze=" + numeroVentasLicenciaBronze + ", numeroVentasLicenciaSilver=" + numeroVentasLicenciaSilver + ", numeroVentasLicenciaGold=" + numeroVentasLicenciaGold + '}';
    }    
}
