package com.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Logue mediante arrays

        boolean acceso = false;
        String[] nameUsers = {"Luis", "Angel", "Jhonson34"};
        String[] paswords = {"Taquillos5", "Lacani32", "Jhonsiton34"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre de usuario");
        String name1 = scanner.nextLine();
        System.out.println("Ingresa tu password");
        String pass1 = scanner.nextLine();


        for (int i = 0; i < nameUsers.length; i++) {

            if (nameUsers[i].equals(name1) && paswords[i].equals(pass1)) {
                acceso = true;
                break;
            }

        }
        if (acceso) {
            System.out.println("Acceso exitoso");
        } else {
            System.out.println("Datos incorrectos");
        }


    }
}

