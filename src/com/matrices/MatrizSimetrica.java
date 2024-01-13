package com.matrices;

public class MatrizSimetrica {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 61},
                {4, 5, 6, 7}
        };

        int j, i;
        i = 0;
        boolean acceso = true;

        salir:
        while (i < numbers.length && acceso) {
            j = 0;
            while (j < i && acceso) {
                if (numbers[i][j] != numbers[j][i]) {
                    acceso = false;
                    break salir;
                }
                j++;
            }
            i++;
        }


        if (acceso) {
            System.out.println("Tu matriz es simetrica");
        } else {
            System.out.println("Tu matriz NO es simetrica");
        }

    }
}
