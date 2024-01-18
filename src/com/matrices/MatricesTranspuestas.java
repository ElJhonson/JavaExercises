package com.matrices;

public class MatricesTranspuestas {
    public static void main(String[] args) {
        int[][] matriz1 = new int[8][4];
        int[][] matriz2 = new int[4][8];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = i + j * 3;
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = matriz1[j][i];
            }
        }

        System.out.println("Matriz 1");
        for (int[] fila : matriz1) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz Compuesta");

        for (int[] fila : matriz2) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }

    }
}
