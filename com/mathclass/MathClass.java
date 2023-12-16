package com.mathclass;

public class MathClass {
    public static void main(String[] args) {
        //Valor absoluto
        int abs = Math.abs(-3);
        System.out.println(abs);
        //Valor mayor
        int max = Math.max(4, 6);
        System.out.println(max);
        //Valor menor
        int min = Math.min(4, 7);
        System.out.println(min);
        //Redondeo hacia arriba
        double up = Math.ceil(5.4356);
        System.out.println(up);
        //Redondeo hacia abajo
        double low = Math.floor(5.4356);
        System.out.println(low);
        //Redondeo general
        long redondear = Math.round(Math.PI);
        System.out.println(redondear);
        //Exponencial(2.718281828459045)
        double exp = Math.exp(1);
        System.out.println(exp);
        //Logaritmo natural
        double log = Math.log(10);
        System.out.println(log);
        //Elevación de potencia
        double potencia = Math.pow(4,2);
        System.out.println(potencia);
        //Raiz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println(raiz);
        //Convertir de radianes a grados
        double grados = Math.toDegrees(1.57);
        System.out.println("Radianes a grados: " +grados);
        //Convertir de grados a radianes
        double radianes = Math.toRadians(90.0);
        System.out.println("Grados a radianes: "+radianes);
        //Encontrar el seno(Siempre acepta radianes)
        System.out.println("sin(90): "+ Math.sin(radianes));
        //Encontrar el coseno(Siempre acepta radianes)
        System.out.println("cos(90): "+ Math.cos(radianes));


    }
}
