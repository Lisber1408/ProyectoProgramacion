package com.renta.controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.renta.modelo.RentaVehiculo;

/**
 *
 * @author LISBER
 */
public class VehiculoFamiliarMediano extends RentaVehiculo{

    //cosntructor
    public VehiculoFamiliarMediano(String nombre, String apellido, 
            String cedula, String numTelefono, int plazo) {
        super(nombre, apellido, cedula, numTelefono, plazo);
    }

    @Override
    public double CalcularCosto() {
        return super.getPlazo()*45;
    }

    @Override
    public String descripcionAutomovil() {
        return "";
    }
    
}
