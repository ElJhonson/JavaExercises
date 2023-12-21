package com.ejercicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EdadCalc {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        Date date = sf.parse(scanner.next());

        Date dateNow = new Date();

        int date1 = Integer.parseInt(format.format(date));
        int date2 = Integer.parseInt(format.format(dateNow));

        System.out.println("Tienes: "+(date2-date1)/10000);

    }
}