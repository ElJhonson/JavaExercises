package com.arrays;

import java.util.Scanner;

public class InsertNumberArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];


        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = i + 1;
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Qué numero quieres insertar: ");
        int insertNum = input.nextInt();

        System.out.print("En qué posición: ");
        int posNum = input.nextInt();

        for (int j = numbers.length - 2; j >= posNum; j--) {
            numbers[j + 1] = numbers[j];
        }

        numbers[posNum] = insertNum;

        int j = 0;
        for (int number : numbers) {
            System.out.println("Posicion: " + (j++) + " - " + number);
        }

    }
}
