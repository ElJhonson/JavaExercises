package com.arrays;

public class Exercise5 {
    public static void main(String[] args) {
        //Histograma con valores del 1 al 6
        int[] numbers = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int[] lista = {1, 2, 3, 4, 5, 6};

        int aux = 0;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (lista[i] == numbers[j]) {
                    aux++;
                }
            }
            System.out.print(lista[i] + ": ");
            for (int j = 0; j < aux; j++) {
                System.out.print("*");
            }
            System.out.println();
            aux = 0;
        }
    }
}
