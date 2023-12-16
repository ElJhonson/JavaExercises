package com.ejercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
    public static void main(String[] args) {

        //Con esto hacemos una instancia de nuestra clase que nos da la hora actual
        Date date = new Date();

        //SimpleDateFormat nos sirve para darle el formato que queramos a nuestra fecha
        SimpleDateFormat format = new SimpleDateFormat("EEEE dd 'de' MMMM yyyy");
        //Aqui estamos convirtinedo nuestra fecha de la clase Date al formato que establecimos
        String fecha = format.format(date);
        System.out.println("La fecha de hoy es: "+fecha);


    }
}
