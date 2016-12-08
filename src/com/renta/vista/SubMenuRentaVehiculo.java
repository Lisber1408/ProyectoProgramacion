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
public class SubMenuRentaVehiculo {

    public static void Renta() {
        
        int opt=0;
        
        //Creación del objeto buseta1 y buseta2. Declaración del mismo
        Buseta buseta1 = new Buseta("Cinascar", "Chery Van", "Gris", 2013);
        Buseta buseta2 = new Buseta("Hyundai", "h1", "Negro", 2011);
        
        while (opt < 3){
            System.out.println("*******MENU RENTA VEHICULO*******\n");
            System.out.println("1. Autos Disponibles");
            System.out.println("2. Registrar Renta");
            System.out.println("3. Regresar a menu principal");
            System.out.println("\n");

            Scanner entrada = new Scanner(System.in);
            opt = entrada.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("*****AUTOS DISPONIBLES*****");
                    System.out.println("AUTOMOVILES\n");
                    System.out.println(buseta1.descripcionAutomovil());
                    break;
                case 2:
                    System.out.println("Registrar Renta: ");
                    System.out.println("aja");
                    break;
                default:
                    opt=3;
                    break;
            }
            System.out.println();
        } 

    }

}
