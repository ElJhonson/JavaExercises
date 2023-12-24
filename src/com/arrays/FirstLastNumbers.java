package com.arrays;

public class FirstLastNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test = new int[10];
        int aux = 0;

        for (int i = 0; i < numbers.length / 2; i++) {
            test[aux++] = numbers[i];
            test[aux++] = numbers[numbers.length - 1 - i];
        }

        for (int i : test) {
            System.out.println(i);
        }

    }
}
