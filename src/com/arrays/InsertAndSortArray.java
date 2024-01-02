package com.arrays;

import java.util.Scanner;

public class InsertAndSortArray {
    public static void main(String[] args) {
        //Aquí insertamos un numero por consola en nuestro array ordenado de menor a mayor
        int[] numbers = new int[6];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("Ingresa un numero: ");
            numbers[i] = input.nextInt();
        }

        System.out.print("Ingresa un numero a insertar: ");
        int numInput = input.nextInt();

        int cont = 0;
        while (cont < numbers.length - 1 && numInput > numbers[cont]) {
            cont++;
        }

        for (int i = numbers.length - 2; i >= cont; i--) {
            numbers[i + 1] = numbers[i];
        }

        numbers[cont] = numInput;

        for (int num : numbers) {
            System.out.println(num);
        }

    }
}
