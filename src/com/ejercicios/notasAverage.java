package com.ejercicios;

import java.util.Scanner;

public class notasAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double notas;
        double contador5 = 0;
        double contadorPara5 = 0;
        double contador4 = 0;
        double contadorPara4 = 0;
        int contador1 = 0;

        for(int i = 1; i<21; i++){
            System.out.println("Nota "+i);
            notas = scanner.nextDouble();
            if (notas == 1){
                contador1++;
            }

            if (notas == 0 || notas>7){
                System.out.println("No se aceptan notas 0 o mayores a 7");
                System.exit(0);
            }
            else if (notas > 5){
                contador5 += notas;
                contadorPara5 ++;
            } else if (notas<4) {
                contador4 += notas;
                contadorPara4++;
            }
        }

        System.out.println("El promedio de las notas mayores a 5 es: "+ (contador5/contadorPara5));
        System.out.println("El Promedio de las notas menores a 4 es: "+ (contador4/contadorPara4));
        System.out.println("Has ingresado "+contador1+" notas 1");
    }
}
