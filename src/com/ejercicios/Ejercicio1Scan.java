package com.ejercicios;

import java.util.Scanner;

public class Ejercicio1Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = 0f;
        float num2 = 0f;

        //Suma de numeros usando la clase Scanner

        try {
            System.out.println("Ingresa un numero: ");
            num1 = scanner.nextFloat();
            System.out.println("Ingresa otro numero: ");
            num2 = scanner.nextFloat();
        }catch (Exception e){
            System.out.println("Datos incorrectos");
            main(args);
            System.exit(0);
        }

        float resultado = num1 + num2;

        System.out.println("La suma de los numeros es: "+resultado);
    }
}

