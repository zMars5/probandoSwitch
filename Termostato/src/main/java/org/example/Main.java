package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double temperaturaAmbiente;

        System.out.println("Diga la temperatura");
        temperaturaAmbiente = scanner.nextDouble();

        if (temperaturaAmbiente == 20.0) {
            temperaturaAmbiente = 25.0;
        } else if (temperaturaAmbiente == 30.0) {
            temperaturaAmbiente = 20.0;
        } else if (temperaturaAmbiente == 40.0) {
            temperaturaAmbiente = 20.0;
        } else {
            System.out.println("Señor usuario, que temperatura desea?");
            temperaturaAmbiente = scanner.nextDouble();
        }
        System.out.println("Querido usuario, su temperatura cambio a: " + temperaturaAmbiente);
    }
}