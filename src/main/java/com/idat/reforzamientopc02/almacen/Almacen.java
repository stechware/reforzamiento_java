/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.reforzamientopc02.almacen;

/**
 *
 * @author Solaris
 */

public class Almacen {

    private int stockBolsasCemento;
    private int capacidad;
    private int numeroRetiros;
    private int numeroDepositos;
    private int cantidadBolsasDepositadas;
    private int cantidadBolsasRetiradas;
    private int cantidadMaximaDepositada;
    private int cantidadMinimaDepositada;
    private int cantidadMaximaRetirada;
    private int cantidadMinimaRetirada;

    public Almacen() {
        this.stockBolsasCemento = 2000;
        this.capacidad = 3500;
        this.numeroRetiros = 0;
        this.numeroDepositos = 0;
        this.cantidadBolsasDepositadas = 0;
        this.cantidadBolsasRetiradas = 0;
        this.cantidadMaximaDepositada = 0;
        this.cantidadMinimaDepositada = 1500;
        this.cantidadMaximaRetirada = 0;
        this.cantidadMinimaRetirada = 2000;
    }

    public int getStockBolsasCemento() {
        return stockBolsasCemento;
    }

    public void setStockBolsasCemento(int stockBolsasCemento) {
        this.stockBolsasCemento = stockBolsasCemento;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public int getNumeroDepositos() {
        return numeroDepositos;
    }

    public void setNumeroDepositos(int numeroDepositos) {
        this.numeroDepositos = numeroDepositos;
    }

    public int getCantidadBolsasDepositadas() {
        return cantidadBolsasDepositadas;
    }

    public void setCantidadBolsasDepositadas(int cantidadBolsasDepositadas) {
        this.cantidadBolsasDepositadas = cantidadBolsasDepositadas;
    }

    public int getCantidadBolsasRetiradas() {
        return cantidadBolsasRetiradas;
    }

    public void setCantidadBolsasRetiradas(int cantidadBolsasRetiradas) {
        this.cantidadBolsasRetiradas = cantidadBolsasRetiradas;
    }

    public int getCantidadMaximaDepositada() {
        return cantidadMaximaDepositada;
    }

    public void setCantidadMaximaDepositada(int cantidadMaximaDepositada) {
        this.cantidadMaximaDepositada = cantidadMaximaDepositada;
    }

    public int getCantidadMinimaDepositada() {
        return cantidadMinimaDepositada;
    }

    public void setCantidadMinimaDepositada(int cantidadMinimaDepositada) {
        this.cantidadMinimaDepositada = cantidadMinimaDepositada;
    }

    public int getCantidadMaximaRetirada() {
        return cantidadMaximaRetirada;
    }

    public void setCantidadMaximaRetirada(int cantidadMaximaRetirada) {
        this.cantidadMaximaRetirada = cantidadMaximaRetirada;
    }

    public int getCantidadMinimaRetirada() {
        return cantidadMinimaRetirada;
    }

    public void setCantidadMinimaRetirada(int cantidadMinimaRetirada) {
        this.cantidadMinimaRetirada = cantidadMinimaRetirada;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "stockBolsasCemento=" + stockBolsasCemento +
                ", capacidad=" + capacidad +
                ", numeroRetiros=" + numeroRetiros +
                ", numeroDepositos=" + numeroDepositos +
                ", cantidadBolsasDepositadas=" + cantidadBolsasDepositadas +
                ", cantidadBolsasRetiradas=" + cantidadBolsasRetiradas +
                ", cantidadMaximaDepositada=" + cantidadMaximaDepositada +
                ", cantidadMinimaDepositada=" + cantidadMinimaDepositada +
                ", cantidadMaximaRetirada=" + cantidadMaximaRetirada +
                ", cantidadMinimaRetirada=" + cantidadMinimaRetirada +
                '}';
    }

    public void deposito(int cantidadDepositar){
        if(cantidadDepositar <= 0){
            System.out.println("===============================================");
            System.out.println("Valor errado para depósito ...");
            return;
        }
        if(stockBolsasCemento + cantidadDepositar > capacidad){
            System.out.println("===============================================");
            System.out.println("Superamos la capacidad del Almacén ...");
            System.out.println("No podemos aceptar la mercadería ...");
            return;
        }
        this.stockBolsasCemento += cantidadDepositar;
        this.cantidadBolsasDepositadas +=cantidadDepositar;
        this.numeroDepositos++;
        if(cantidadDepositar > cantidadMaximaDepositada){
            this.cantidadMaximaDepositada = cantidadDepositar;
        }
        if(cantidadDepositar < cantidadMinimaDepositada){
            this.cantidadMinimaDepositada = cantidadDepositar;
        }
        imprimirValores();
    }

    public void retiro(int cantidadRetirar){
        if(cantidadRetirar <= 0){
            System.out.println("===============================================");
            System.out.println("Valor errado para retiro ...");
            return;
        }
        if(stockBolsasCemento - cantidadRetirar < 0){
            System.out.println("===============================================");
            System.out.println("No tengo capacidad para atender el pedido ...");
            return;
        }
        this.stockBolsasCemento -= cantidadRetirar;
        this.cantidadBolsasRetiradas +=cantidadRetirar;
        this.numeroRetiros++;
        if(cantidadRetirar > cantidadMaximaRetirada){
            this.cantidadMaximaRetirada = cantidadRetirar;
        }
        if( cantidadRetirar < cantidadMinimaRetirada){
            this.cantidadMinimaRetirada = cantidadRetirar;
        }
        imprimirValores();

    }

    public void imprimirValores(){

        System.out.println("===============================================");
        System.out.println("Stock actual del almacén = "+stockBolsasCemento);
        System.out.println("Capacidad Libre = "+ (capacidad - stockBolsasCemento));
        System.out.println("Número de depósitos Efectuados = "+ numeroDepositos);
        System.out.println("Número de retiros Efectuados = "+ numeroRetiros);
        System.out.println("Cantidad de Bolsas Depositadas = "+ cantidadBolsasDepositadas);
        System.out.println("Cantidad de Bolsas Retiradas = "+ cantidadBolsasRetiradas);
        System.out.println("Cantidad maxima Depositada = "+ cantidadMaximaDepositada);
        System.out.println("Cantidad mínima Depositada = "+ cantidadMinimaDepositada);
        System.out.println("Cantidad máxima Retirada = "+ cantidadMaximaRetirada);
        System.out.println("Cantidad mínima Retirada = "+ cantidadMinimaRetirada);
    }

}

