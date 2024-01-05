package com.arrays;

public class Exercise2 {

    public static void main(String[] args) {
        //Vamos a mostrar el Numero mayor del array
        int[] numbers = {14, 33, 15, 36, 18, 21, 53};

        int test = 0;

        for (int i = 1; i < numbers.length; i++) {
            test = numbers[test] > numbers[i] ? test : i;
        }

        System.out.println("El numero mayor es: " + numbers[test]);
    }
}
