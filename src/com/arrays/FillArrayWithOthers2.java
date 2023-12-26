package com.arrays;

public class FillArrayWithOthers2 {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        //Fill array a
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        //Fill array b
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 3;
        }

        int aux = 0;

        for (int i = 0; i < a.length; i += 2) {
            for (int j = 0; j < 2; j++) {
                c[aux++] = a[i + j];
            }
            for (int j = 0; j < 2; j++) {
                c[aux++] = b[i + j];
            }
        }

        for (int num : c) {
            System.out.println(num);
        }

    }
}
