package com.matrices;

public class SintaxisMatriz {
    public static void main(String[] args) {
        String[][] names = new String[3][2];

        names[0][0] = "Pepe";
        names[0][1] = "Maria";

        names[1][0] = "Pato";
        names[1][1] = "Bea";

        names[2][0] = "Lucas";
        names[2][1] = "Luci";

        //For
        /*for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);

            }
        }*/

        //ForEach

        for (String[] fila : names) {
            for (String name : fila) {
                System.out.print(name + "\t");
            }
            System.out.println();
        }


    }
}
