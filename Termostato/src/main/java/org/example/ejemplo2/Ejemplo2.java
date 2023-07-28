package org.example.ejemplo2;

import java.util.Scanner;

public class Ejemplo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int variableALaQueLeMiroElEstado = 10;
        switch (variableALaQueLeMiroElEstado) {
            case 0:
                System.out.println("El camino se fue por 0");
                break;
            case 10:
                System.out.println("El camino se fue por 10");
                break;
            case 100:
                System.out.println("El camino se fue por 100");
                break;
            default:
                System.out.println("El camino por defecto");
                System.out.println("No es ni 0 ni 10 ni 100");
                break;
        }
     }
}
