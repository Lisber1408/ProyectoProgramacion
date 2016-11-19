/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renta;

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

        System.out.println("RENTA de VEHICULOS");
        System.out.println("1.Rentar Vehiculo");
        System.out.println("2.Consultar Vehiculos Rentados");
        System.out.println("3.Devoluciones");
        System.out.println("4.Informacion");
        opt = entrada.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Rentar Vehiculo");
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
