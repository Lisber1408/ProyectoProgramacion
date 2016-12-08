/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renta.vista;

import com.renta.controlador.Buseta;
import java.util.Scanner;

/**
 *
 * @author LISBER
 */
public class PruebaRenta {

    private String fechaInicio;
    private String fechaFin;

    public static void main(String[] args) {
        int opt = 0;
        Scanner entrada = new Scanner(System.in);

        while (opt != 5){
            System.out.println("RENTA DE VEHICULOS");
            System.out.println("1. Rentar Vehiculo");
            System.out.println("2. Consultar Vehiculos Rentados");
            System.out.println("3. Devoluciones");
            System.out.println("4. Informacion");
            System.out.println("5. Salir");
            opt = entrada.nextInt();
            switch (opt) {
                case 1:
                    //llama el metodo "Renta" de la clase 
                    //SubMenuRentaVehiculo
                    SubMenuRentaVehiculo.Renta();
                    break;
                case 2:
                    System.out.println("Consultar Vehiculos Rentados");
                    break;
                case 3:
                    System.out.println("Devoluciones de Vehiculos");
                    break;
                case 4:
                    System.out.println("Informacion");
                    break;
                default:
                    break;
            }

        } 
    }

}
