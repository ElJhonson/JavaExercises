package com.matrices;

public class SearchItem {
    public static void main(String[] args) {
        int[][] numbers = {{17, 25, 23}, {41, 55, 31}, {2, 19, 32}};
        int number = 19;
        boolean found = false;

        int i;
        int j = 0;

        for (int[] fila : numbers) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }

        matriz:
        for (i = 0; i < numbers.length; i++) {
            for (j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == number) {
                    found = true;
                    break matriz;
                }
            }
        }

        if (found) {
            System.out.println("Elemento encontrado en las coordenadas: " + i + "," + j);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}
