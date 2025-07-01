package org.example;
import java.util.*;
import javax.swing.*;
public class NumerosPrimos {
    public static void main(String[] args) {

        //Instancia de NumeroPrimo
        NumeroPrimo primo = new NumeroPrimo();

          JOptionPane.showMessageDialog(null, "Buenvenido al sistema para calculo de numeros primos,");
          String[] opciones = {"Lista de numeros primos entre dos opciones de numeros", "Calcular si el numero es primo", "cancelar"};
       // String texto2 = JOptionPane.showInputDialog("Ingrese ok si quiere un listado de numeros primos contenidos en dos numeros");
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "¿Qué desea hacer?",
                "Menú de opciones",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]  );

                //Manejo de selecciones

                          if (seleccion == 0) {
                              String valor1 = JOptionPane.showInputDialog("Ingrese el primer valor");
                              int numero1 = Integer.parseInt(valor1);
                              String valor2 = JOptionPane.showInputDialog("Ingrese el segundo valor");
                              int numero2 = Integer.parseInt(valor2);

                              //En caso de que el primer valor sea mayor que el segundo

                              if (numero1 > numero2) {
                                  int temp = numero1;
                                  numero1 = numero2;
                                  numero2 = temp;
                              }


                              // Buscar el último número primo en el rango
                              int ultimoPrimo = -1;
                              for (int i = numero2; i >= numero1; i--) {
                                  if (primo.NumeroPrimo(i)) {
                                      ultimoPrimo = i;
                                      break;
                                  }
                              }
                              // Calculo de valores primos entre valor 1 y valor2

                              //int[] primos = i;

                              while (true) {
                                  List<Integer> acumulador = new ArrayList<>();
                                  for (int i = numero1; i <= numero2; i++) {

                                      if (i == numero1) {
                                          if (primo.NumeroPrimo(i) == true) {
                                             // JOptionPane.showMessageDialog(null, "[" + i + "," + " ");
                                              acumulador.add(i);
                                          }
                                      } else if (i != ultimoPrimo) {
                                          if (primo.NumeroPrimo(i) == true) {
                                             // JOptionPane.showMessageDialog(null, "," + i + " ,");
                                              acumulador.add(i);
                                          }
                                      } else if(i == ultimoPrimo) {
                                          if (primo.NumeroPrimo(i) == true) {
                                              //JOptionPane.showMessageDialog(null, ", " + i + " ]");
                                              acumulador.add(i);
                                          }
                                      }
                                  }
                                  if (acumulador.isEmpty()) {
                                      JOptionPane.showMessageDialog(null, "No se encontraron números primos entre " + numero1 + " y " + numero2 + ".");
                                  } else {
                                      JOptionPane.showMessageDialog(null, "Números primos entre " + numero1 + " y " + numero2 + ":\n" + acumulador);
                                  }
                                  break;



                              }


                          } else if (seleccion == 1) {
                           String valor = JOptionPane.showInputDialog("Ingrese el valor que desea conocer");

                             try {
                                 int valornumerico = Integer.parseInt(valor);
                                 if (primo.NumeroPrimo(valornumerico) == true) {
                                     JOptionPane.showMessageDialog(null, "El valor ingresado es un úmero primo");
                                 } else if (primo.NumeroPrimo(valornumerico) == false) {
                                     JOptionPane.showMessageDialog(null, "El valor ingresado No es un úmeros primo");
                                 }
                             }catch (Exception e){
                                 JOptionPane.showMessageDialog(null, "El valor ingresado no es válido, por favor ingrese un valor numérico válido");
                             }



                          } else if (seleccion == 2 || seleccion == JOptionPane.CLOSED_OPTION) {
                           JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. ¡Hasta luego!");
                          }

    }
}