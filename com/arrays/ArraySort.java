package com.arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        String[] nombres = new String[5];

        numeros[0] = 19;
        numeros[1] = 27;
        numeros[2] = 32;
        numeros[3] = 24;
        numeros[4] = 6;

        //Ordena los items de tu array de forma ascendente
        Arrays.sort(numeros);

        //busca la posición del elemento
        System.out.println(Arrays.binarySearch(numeros, 32));

        nombres[0] = "Luis";
        nombres[1] = "Angel";
        nombres[2] = "jhonson";
        nombres[3] = "Alita";
        nombres[4] = "renata";

        Arrays.sort(nombres);

        for (int numero: numeros) {
            System.out.println(numero);
        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
