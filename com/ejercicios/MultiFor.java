package com.ejercicios;

import java.util.Scanner;

public class MultiFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa un numero a multiplicar:");
        int num1 = scanner.nextInt();
        System.out.println("Cuantas veces lo quieres multiplicar:");
        int num2 = scanner.nextInt();
        int num1Posit = Math.abs(num1);
        int num2Posit = Math.abs(num2);

        int contador = 0;

        for (int i = 0; i < num1Posit; i++) {
            contador += num2Posit;
        }

        if ((num1 <0 && num2<0) || (num1 > 0 && num2 > 0)) {
            System.out.println(contador);
        }else{
            System.out.println(-contador);
        }

    }
}
