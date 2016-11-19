/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renta;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    private int numTelefono;
    private int anio;
    private int dia;
    private int mes;
    private int aniof;
    private int diaf;
    private int mesf;
    //atributos de la clase
    private double costo;
    private int plazo;
    private String msj;

    public RentaVehiculo(String nombre, String apellido, String cedula, int numTelefono, int anio, int dia, int mes, int aniof, int diaf, int mesf) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.numTelefono = numTelefono;
        this.anio = anio;
        this.dia = dia;
        this.mes = mes;
        this.aniof = aniof;
        this.diaf = diaf;
        this.mesf = mesf;
    }


    public double CalcularCosto() {

        return costo;

    }

}
