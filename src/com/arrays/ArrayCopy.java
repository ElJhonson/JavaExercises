package com.arrays;

import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int lastNum;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Qué numero quieres insertar: ");
        int insertNum = input.nextInt();

        System.out.print("En qué posición: ");
        int posNum = input.nextInt();

        lastNum = numbers[numbers.length - 1];

        for (int j = numbers.length - 2; j >= posNum; j--) {
            numbers[j + 1] = numbers[j];
        }
        numbers[posNum] = insertNum;

        int[] newArray = new int[numbers.length + 1];
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);

        newArray[newArray.length - 1] = lastNum;

        int j = 0;
        for (int number : newArray) {
            System.out.println("Posicion: " + (j++) + " - " + number);
        }
    }
}
