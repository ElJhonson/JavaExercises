package com.arrays;

import java.util.Scanner;

public class Exercise3 {
    //Leer 7 números por teclado para llenar un arreglo
    //y a continuación calcular el promedio de los números positivos, el promedio de los negativos y contar el número de ceros.
    public static void main(String[] args) {

        int[] numbers = new int[7];
        Scanner input = new Scanner(System.in);

        double averageP = 0, averageN = 0;
        int cont = 0, contN = 0, contCero = 0;

        int size = numbers.length;

        for (int i = 0; i < size; i++) {
            System.out.println("Ingresa un numero(Negativo, positivo o cero)");
            numbers[i] = input.nextInt();
        }

        for (int number : numbers) {
            if (number > 0) {
                averageP += number;
                cont++;

            } else if (number < 0) {
                averageN += number;
                contN++;
            } else {
                contCero++;
            }
        }

        System.out.println("-- Resultados --");
        System.out.println("Promedio de numeros positivos: " + (averageP / cont));
        System.out.println("Promedio de numeros Negativos: " + (averageN / contN));
        System.out.println("Cantidad de ceros: " + contCero);

    }
}
