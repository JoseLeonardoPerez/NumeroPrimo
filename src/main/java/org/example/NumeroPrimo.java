package org.example;
import javax.swing.*;
public class NumeroPrimo {
    public static void main(String[] args) {

        while (true) {
            String numero = JOptionPane.showInputDialog("Ingrese el numero a evaluar");

            if (numero == null) {
                JOptionPane.showMessageDialog(null, "Programa finalizado.");
                break;
            }
            try {
               int numeroconvertido = Integer.parseInt(numero);



                if (numeroconvertido != 2 && numeroconvertido % 2 == 0) {
                    System.out.println("El numero no es primo");
                } else if (numeroconvertido != 3 && numeroconvertido % 3 == 0) {
                    System.out.println("El numero no es primo");
                } else if (numeroconvertido != 4 && numeroconvertido % 4 == 0) {
                    System.out.println("El numero no es primo");
                } else if (numeroconvertido != 5 && numeroconvertido % 5 == 0) {
                    System.out.println("El numero no es primo");
                } else if (numeroconvertido != 6 && numeroconvertido % 6 == 0) {
                    System.out.println("El numero no es primo");
                } else if (numeroconvertido != 7 && numeroconvertido % 7 == 0) {
                    System.out.println("El numero no es primo");
                } else if (numeroconvertido != 8 && numeroconvertido % 8 == 0) {
                    System.out.println("El numero no es primo");
                } else if (numeroconvertido != 9 && numeroconvertido % 9 == 0) {
                    System.out.println("El numero no es primo");
                } else {
                    System.out.println("El número es primo");
                }

            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número entero.");
                continue;
            }
        }

    }
}