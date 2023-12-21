package com.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Practica con metodos para String y concatenacion

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name 1");
        String name1 = scanner.nextLine();
        System.out.println("Name 2");
        String name2 = scanner.nextLine();
        System.out.println("Name 3");
        String name3 = scanner.nextLine();

        String customName1 = name1.substring(0,1).toUpperCase()+"."+name1.substring(name1.length()-2);

        String customName2 = name2.substring(0,1).toUpperCase()+"."+name2.substring(name2.length()-2);

        String customName3 = name3.substring(0,1).toUpperCase()+"."+name3.substring(name3.length()-2);

        System.out.println(customName1.concat("_").concat(customName2).concat("_").concat(customName3));


    }
}
 