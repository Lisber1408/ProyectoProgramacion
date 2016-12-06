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
public class menuRentaVehiculo {

    public static void Renta() {

        System.out.println("MENU RENTA VEHICULO\n");
        System.out.println("1.Autos Disponibles\n");
        System.out.println("2.Registrar Renta");
        System.out.println("\n");
        int opt = 0;
        Scanner entrada = new Scanner(System.in);
        opt = entrada.nextInt();

        switch (opt) {
            case 1:
                System.out.println("AUTOS DISPONIBLES");
                System.out.println("AUTOMOVILES");

                System.out.println("");
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
        }
    }

}
