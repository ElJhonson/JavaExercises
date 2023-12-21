package com.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
//programa que te da el numero menor de 10 o mas numeros
        Scanner scanner = new Scanner(System.in);
        int cont;
        int nums;
        System.out.println("Cuantos numeros vas a ingresar?");
        int times = scanner.nextInt();

        if (times>=10){
            cont = Integer.MAX_VALUE;
            for (int i = 1; i<=times; i++){
                System.out.println("Numero "+i+": ");
                nums = scanner.nextInt();
                cont = nums<cont?nums:cont;
            }
            System.out.println(cont);

            if (cont<10){
                System.out.println("El numero menor es menor que 10");
            }else{
                System.out.println("El numero menor es igual o mayor que 10 ");
            }
        }else{
            System.out.println("Necesitas ingresar 10 o mas numeros");
        }

    }
}
