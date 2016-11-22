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
public class RentaVehiculo {

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private String apellido;
    private String cedula;
    private String numTelefono;
    private int plazo;

    //atributos de la clase
    private double costo;
    private String msj;

    public RentaVehiculo(String nombre, String apellido, String cedula, String numTelefono, int plazo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.numTelefono = numTelefono;
        this.plazo = plazo;
    }

    public double CalcularCosto() {
        
        return costo;

    }

}
