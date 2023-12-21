package com.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        //Medidas de un estanque de gasolina
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la medida actual en litros del tanque:");
        double medida = scanner.nextDouble();

        if (medida >=70){
            System.out.println("Estanque lleno");
        } else if (medida<70 && medida >=60) {
            System.out.println("Estanque casi lleno");
        } else if (medida<60 && medida>=40) {
            System.out.println("Estanque 3/4");
        } else if (medida<40 && medida>=35) {
            System.out.println("Medio estanque");
        } else if (medida<35 && medida>=20) {
            System.out.println("Suficiente");
        } else if (medida<20 && medida>=1) {
            System.out.println("Insuficiente");
        }else {
            System.out.println("Ingresa un numero correcto");
        }
    }
}
