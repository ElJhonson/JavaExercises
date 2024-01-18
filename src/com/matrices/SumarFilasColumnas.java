package com.matrices;

public class SumarFilasColumnas {
    public static void main(String[] args) {
        int[][] a = {{14, 23, 36},
                {8, 19, 21},
                {4, 23, 81}};

        int sumFila = 0, sumColum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sumFila += a[i][j];
                sumColum += a[j][i];
            }
            System.out.println("suma de fila " + i + ": " + sumFila);
            System.out.println("suma de columna" + i + ": " + sumColum);
        }
    }
}
