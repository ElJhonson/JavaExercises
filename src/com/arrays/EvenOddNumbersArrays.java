package com.arrays;

import java.util.Scanner;

public class EvenOddNumbersArrays {
    //Aqui ingresamos datos, se guardan en un array y apartir de ahi los separamos en numeros paras e impares con sus respectivos arrays
    public static void main(String[] args) {
        int[] even, odd, numbers;
        numbers = new int[7];

        Scanner input = new Scanner(System.in);

        System.out.println("Type 7 numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int contEven = 0;
        int contOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                contEven++;
            } else {
                contOdd++;
            }
        }

        even = new int[contEven];
        odd = new int[contOdd];

        int a = 0;
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even[a++] = numbers[i];
            } else {
                odd[b++] = numbers[i];
            }
        }
        System.out.println("Even numbers");
        for (int number : even) {
            System.out.println(number);
        }
        System.out.println("Odd numbers");
        for (int number : odd) {
            System.out.println(number);
        }

    }
}
