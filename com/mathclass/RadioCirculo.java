package com.mathclass;

import java.util.Scanner;

public class RadioCirculo {
    public static void main(String[] args) {
        //área = PI*r² (Constante PI multiplicado por el radio al cuadrado).

        Scanner scanner = new Scanner(System.in);

        double pi = Math.PI;

        System.out.println("Ingresa el radio de tu circunferencia:");
        double radio = scanner.nextDouble();
        radio = Math.pow(radio, 2);

        double resultado = pi * radio;

        System.out.printf("El radio de tu circunferencia es: " + "%.2f%n",resultado);

    }
}
