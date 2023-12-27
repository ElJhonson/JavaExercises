package com.arrays;

import java.util.Scanner;

public class DetectArrayOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        boolean descendente = false;
        boolean ascendente = false;

        System.out.println("Type 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                descendente = true;
            }
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                ascendente = true;
            }
        }

        if (ascendente && !descendente) {
            System.out.println("Tu array tiene un orden ascendente");
        }

        if (!ascendente && descendente) {
            System.out.println("Tu array tiene un orden descendente");
        }

        if (ascendente && descendente) {
            System.out.println("Tu array no tiene un orden");
        }

    }
}
