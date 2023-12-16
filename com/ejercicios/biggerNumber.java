package com.ejercicios;

import java.util.Scanner;

public class biggerNumber {
    public static void main(String[] args){
        //Número mayor entre 3 numeros

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        float num1 = scanner.nextFloat();

        System.out.println("Ingresa un segundo numero");
        float num2 = scanner.nextFloat();

        System.out.println("Ingresa un tercer numero");
        float num3 = scanner.nextFloat();

        float resultado = num1>num2? num1: num2;
        float secondPart = resultado>num3? resultado: num3;

        System.out.println("El numero mayor es: "+secondPart);



    }
}


