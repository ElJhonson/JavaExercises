package com.ejercicios;
public class Ejercicio9 {
    public static void main(String[] args) {

        int num2 = 5;

        System.out.println(num2);

        externo(num2);

        System.out.println(num2);

    }

    public static void externo(int num){
        num = 15;
    }
}
