/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renta;

/**
 *
 * @author LISBER
 */
public class Buseta extends RentaVehiculo{

    public Buseta(String nombre, String apellido, String cedula, 
            String numTelefono, int plazo) {
        super(nombre, apellido, cedula, numTelefono, plazo);
    }

    @Override
    public double CalcularCosto() {
         return super.getPlazo()*70.0;
    }

    @Override
    public double garantia() {
        return CalcularCosto()/2;
    }

    @Override
    public String descripcion() {
        return "";
    }
    
    
}
