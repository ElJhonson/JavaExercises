package com.arrays;

public class Exercise4 {
    public static void main(String[] args) {
        //mayor ocurrencia de un numero y sus repeticiones

        int[] numbers = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};
        int[] times = new int[numbers.length];

        int cont = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    cont++;
                }
            }
            times[i] = cont;
            cont = 0;
        }
        int k = 0;
        int mayor = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (times[i] > mayor) {
                mayor = times[i];
                k = i;
            }
        }

        System.out.println("La mayor ocurrencia es: " + mayor);
        System.out.println("numero con mayor repeticiones: " + numbers[k]);

    }
}
