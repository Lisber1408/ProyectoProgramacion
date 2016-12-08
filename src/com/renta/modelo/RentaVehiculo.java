/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renta.modelo;

/**
 *
 * @author LISBER
 */

//link para guiarnos en los atributos de los automoviles
//http://www.autobild.es/coches
//

public abstract class RentaVehiculo {

    /**
     * @param args the command line arguments
     */
    //atributos de la clase datos del usuario
    private String nombre;
    private String apellido;
    private String cedula;
    private String numTelefono;
    private int plazo;

    //atributos de la clase datos de los automoviles
    private String marca;
    private String modelo;
    private String color;
    private int anio;

    //constructor con parametros de entrada de los usuarios
    public RentaVehiculo(String nombre, String apellido, String cedula, String numTelefono, int plazo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.numTelefono = numTelefono;
        this.plazo = plazo;
    }
    
    //constructor con parametros de entrada de los automoviles
    public RentaVehiculo(String marca, String modelo, String color, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }

    //set y get correspondites del constructor para usuarios
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    //***********************
    //set y get correspondientes del constructor para automóviles
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    abstract public double CalcularCosto();

    public double garantia (){
        return CalcularCosto()/2;
    }
    
    //metodo abstracto describiendo el automovil
    abstract public String descripcionAutomovil ();
    
}
