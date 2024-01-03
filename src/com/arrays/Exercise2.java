package com.arrays;

public class Exercise2 {

    public static void main(String[] args) {
        //Numero mayor
        int[] numbers = {14, 33, 15, 36, 18, 21, 3};

        int test = 0;

        for (int i = 1; i < numbers.length; i++) {
            test = numbers[test] > numbers[i] ? test : i;
        }

        System.out.println("El numero mayor es: " + numbers[test]);
    }
}
