package com.matrices;

public class FilasaColumnas {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4},
                {7, 15, 20, 5},
                {11, 5, 11, 8},
                {3, 1, 9, 17}
        };

        int aux;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = numbers[i][j];
                numbers[i][j] = numbers[j][i];
                numbers[j][i] = aux;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
