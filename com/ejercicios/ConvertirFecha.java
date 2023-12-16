package com.ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConvertirFecha {
    public static void main(String[] args) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una fecha con este fotmato: yyyy-MM-dd");
        try {
            Date date = df.parse(scanner.next());
            System.out.println("date = " + date);
            System.out.println("date = " + df.format(date));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
