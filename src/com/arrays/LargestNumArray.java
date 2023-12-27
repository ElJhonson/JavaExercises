package com.arrays;

import java.util.Scanner;

public class LargestNumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + " Ingresa un numero:");
            numbers[i] = input.nextInt();
        }

        //aux va tomando el numero de i que es la posicion del numero mayor o menos
        int aux = 0;
        for (int i = 1; i < numbers.length; i++) {
            aux = ((numbers[aux] > numbers[i]) ? aux : i);
        }


        System.out.println("El numero mas grande es: " + numbers[aux]);

        System.out.println();
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
