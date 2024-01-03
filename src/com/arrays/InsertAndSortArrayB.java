package com.arrays;

import java.util.Scanner;

public class InsertAndSortArrayB {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Ingresa un numero: ");
            numbers[i] = input.nextInt();
        }

        System.out.print("Ingresa un numero a insertar: ");
        int numInput = input.nextInt();
        int lastNum = numbers[numbers.length - 1];

        int cont = 0;
        while (cont < numbers.length - 1 && numInput > numbers[cont]) {
            cont++;
        }

        int[] newArray = new int[numbers.length + 1];
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);

        for (int i = newArray.length - 2; i >= cont; i--) {
            newArray[i + 1] = newArray[i];
        }

        if (numInput > lastNum) {
            newArray[newArray.length - 1] = numInput;
        } else {
            newArray[newArray.length - 1] = lastNum;
            newArray[cont] = numInput;
        }


        for (int num : newArray) {
            System.out.println(num);
        }

    }
}
