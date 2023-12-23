package com.arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //sorting out our array with bubble sort
        int[] numbers = {3, 5, 2, 1, 4};

        int aux;
        int size = numbers.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }

        for (int i = size - 1; i > 0; i--) {
            System.out.println(numbers[i]);
        }

    }
}
