package com.matrices;

public class ColumnasVariables {
    public static void main(String[] args) {
        int[][] numbers = new int[3][];

        numbers[0] = new int[2];
        numbers[1] = new int[3];
        numbers[2] = new int[5];


        System.out.println(numbers[0].length);
        System.out.println(numbers[1].length);
        System.out.println(numbers[2].length);

        System.out.println();
        for (int[] fila : numbers) {
            for (int number : fila) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
