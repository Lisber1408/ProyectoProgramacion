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
public abstract class RentaVehiculo {

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private String apellido;
    private String cedula;
    private String numTelefono;
    private int plazo;

    //atributos de la clase

    public RentaVehiculo() {
    }


    public RentaVehiculo(String nombre, String apellido, String cedula, String numTelefono, int plazo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.numTelefono = numTelefono;
        this.plazo = plazo;
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
    
    abstract public double CalcularCosto();

    public double garantia (){
        return CalcularCosto()/2;
    }
    
    abstract public String descripcion ();
}
