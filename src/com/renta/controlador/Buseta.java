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

    String marca;
    String color;

    public Buseta(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public Buseta(String nombre, String apellido, String cedula,
            String numTelefono, int plazo) {
        super(nombre, apellido, cedula, numTelefono, plazo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    public String descripcion() {
        return "Descripcion:" + "Marca" + getMarca() + "Color" + getColor();
    }

}
