/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renta.controlador;
//importamos del paquete com.renta.modelo la clase RentaVehiculo
//que es nuestra superClase
import com.renta.modelo.RentaVehiculo;

/**
 *
 * @author LISBER
 */
public class Buseta extends RentaVehiculo {

    public Buseta(String marca, String modelo, String color, int anio) {
        super(marca, modelo, color, anio);
    }

    public Buseta(String nombre, String apellido, String cedula,
            String numTelefono, int plazo) {
        super(nombre, apellido, cedula, numTelefono, plazo);
    }

    @Override
    public double CalcularCosto() {
        return super.getPlazo() * 70.0;
    }

    @Override
    public double garantia() {
        return CalcularCosto() / 2;
    }

    @Override
    public String descripcionAutomovil() {
        return "BUSETA\n" + "\tMarca: " +
                super.getMarca() + "\n\tModelo: " + super.getModelo() 
                +"\n\tColor: " + super.getColor() + "\n\tAnio: " +
                super.getAnio();
    }

}
