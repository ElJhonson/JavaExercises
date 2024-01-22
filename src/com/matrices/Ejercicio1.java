package com.matrices;

public class Ejercicio1 {
    public static void main(String[] args) {
        //X
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || (j == size - i - 1)) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }
}
