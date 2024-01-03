package com.arrays;

import java.util.Scanner;

public class DeletedItemArray {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Ingresa un numero: ");
            numbers[i] = input.nextInt();
        }

        System.out.print("De qué posicion quieres borrar el elemento: ");
        int deleteNum = input.nextInt();


        for (int i = deleteNum; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        int[] newArray = new int[numbers.length - 1];

        System.arraycopy(numbers, 0, newArray, 0, newArray.length);

        int j = 0;
        for (int number : newArray) {
            System.out.println((j++) + " => " + number);
        }
    }
}
