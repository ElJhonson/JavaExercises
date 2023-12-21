package com.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Organiza numeros de mayor a menor
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa otro numero");
        int num2 = scanner.nextInt();

        String numeros = num1 > num2? String.valueOf(num1) +", "+ String.valueOf(num2): String.valueOf(num2) +", "+ String.valueOf(num1);

        System.out.println(numeros);
    }
}
