package com.matrices;

public class Ejercicio1P1 {
    public static void main(String[] args) {
        //X
        int size = 50;
        String[][] equis = new String[size][size];
        for (int i = 0; i < equis.length; i++) {
            for (int j = 0; j < equis[i].length; j++) {
                equis[i][j] = "_";
            }
        }

        for (int i = 0; i < equis.length; i++) {
            for (int j = 0; j < equis[i].length; j++) {
                equis[i][i] = "X";
                equis[i][size - 1 - i] = "X";
            }
        }


        for (String[] fila : equis) {
            for (String letra : fila) {
                System.out.print(letra);
            }
            System.out.println();
        }

    }
}
