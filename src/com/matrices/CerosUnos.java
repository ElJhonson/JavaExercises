package com.matrices;

public class CerosUnos {
    public static void main(String[] args) {
        int[][] numbers = new int[5][5];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (j == i) {
                    numbers[i][j] = 0;
                } else {
                    numbers[i][j] = 1;
                }
            }
        }

        for (int[] fila : numbers) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
