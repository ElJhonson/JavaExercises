package com.arrays;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner input = new Scanner(System.in);

        System.out.println("Numeros reordenados");

        //Vamos a mostrar el último numero con el primero, penultimo con el segundo ...
        for (int i = 0; i < numbers.length / 2; i++) {
            System.out.println(numbers[numbers.length - 1 - i]);
            System.out.println(numbers[i]);
        }

    }
}
