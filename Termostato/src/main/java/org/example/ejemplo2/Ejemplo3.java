package org.example.ejemplo2;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double temperaturaAmbiente = scanner.nextDouble();
        String temperaturaComoTexto = temperaturaAmbiente.toString();

        System.out.println("Digita la temperatura actual");
        temperaturaAmbiente = scanner.nextDouble();

        switch (temperaturaComoTexto) {
            case "20.0":
                temperaturaAmbiente = 25.0;
                break;
            case "30.0":
                temperaturaAmbiente = 20.0;
                break;
            case "40.0":
                temperaturaAmbiente = 20.0;
                System.out.println("Te estas muriendo");
                break;
            default:
                System.out.println("Digite la temperatura que quiera: ");
                temperaturaAmbiente = scanner.nextDouble();
        }

    }
}
