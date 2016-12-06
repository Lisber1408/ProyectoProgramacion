/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renta.controlador;

import com.renta.modelo.RentaVehiculo;

/**
 *
 * @author LISBER
 */
public class VehiculoFamiliarGrande extends RentaVehiculo{

    //constructor
    public VehiculoFamiliarGrande(String nombre, String apellido,
            String cedula, String numTelefono, int plazo) {
        super(nombre, apellido, cedula, numTelefono, plazo);
    }

    @Override
    public double CalcularCosto() {
        return super.getPlazo()*65;
     }


    @Override
    public String descripcion() {
        return "";
    }
    
}
