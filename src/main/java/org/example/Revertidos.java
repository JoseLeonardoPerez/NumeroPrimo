package org.example;
import java.util.*;
import javax.swing.*;

public class Revertidos {

    public Revertidos(String valor) {


        String valorinvertido = new StringBuilder(valor).reverse().toString();
        int numeroinvertido = Integer.parseInt(valorinvertido);

        JOptionPane.showMessageDialog(null, "El numero invertido es:" + numeroinvertido);
    }
}
