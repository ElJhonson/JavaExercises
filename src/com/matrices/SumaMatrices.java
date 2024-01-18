package com.matrices;

public class SumaMatrices {
    public static void main(String[] args) {
        int[][] a = {{14, 23, 36}, {8, 19, 21}, {4, 23, 8}};
        int[][] b = {{1, 20, 6}, {6, 9, 2}, {14, 2, 8}};
        int[][] c = new int[3][3];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int[] fila : c) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
