package org.example;

import javax.swing.*;

public class NumeroPrimo {
    public boolean NumeroPrimo(int numeroPrimo){


            if (numeroPrimo != 2 && numeroPrimo % 2 == 0) {
                return false;
            } else if (numeroPrimo != 3 && numeroPrimo % 3 == 0) {
                return false;
            } else if (numeroPrimo != 4 && numeroPrimo % 4 == 0) {
                return false;
            } else if (numeroPrimo != 5 && numeroPrimo % 5 == 0) {
                return false;
            } else if (numeroPrimo != 6 && numeroPrimo % 6 == 0) {
                return false;
            } else if (numeroPrimo != 7 && numeroPrimo % 7 == 0) {
                return false;
            } else if (numeroPrimo != 8 && numeroPrimo % 8 == 0) {
                return false;
            } else if (numeroPrimo != 9 && numeroPrimo % 9 == 0) {
                return false;
            } else {
                return true;
            }


    }

    }

