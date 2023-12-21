package com.ejercicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendario {
    public static void main(String[] args) {

        //Calendar te ayuda a establecer una fecha customizada

        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat format = new SimpleDateFormat("yyyy - MMMM - dd - hh:mm:ss ");

        calendar.set(2004, Calendar.OCTOBER, 20, 1, 24, 10);
        Date fecha = calendar.getTime();
        String formato = format.format(fecha);
        System.out.println("fecha = " + formato);
    }
}
