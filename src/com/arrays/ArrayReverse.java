package com.arrays;

import java.util.Arrays;
//import java.util.Collections;

public class ArrayReverse {
    public static void main(String[] args) {
        Integer[] edades = {19, 27, 23, 1, 2, 55, 51};

        int longitud = edades.length;

        Arrays.sort(edades);

        //Collections.reverse(Arrays.asList(edades));

        //for (int edad: edades) {
        //    System.out.println(edad);
        //}

        //Forma manual

        for (int i = 0; i < longitud / 2; i++) {
            int numeros = edades[i];
            int inverso = edades[longitud-1-i];
            edades[i] = inverso;
            edades[longitud-1-i] = numeros;
        }

        for (Integer edad: edades) {
            System.out.println(edad);
        }

//1, 2, 19, 23, 27, 51, 55  -  55, 51, 27, 23, 19, 2, 1


    }
}
