package com.mathclass;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        //También podemos tener nuestra instancia de clase normal
        Random random = new Random();
        //Y podemos generar nuestro tipo de dato primitivo que abarca un rango de numeros
        int randomInt = random.nextInt();
        System.out.println(randomInt);
        //De esta manera podemos asignar el rango de numeros que queremos, sin contar el numero establecido(0-9)
        int randomInt2 = random.nextInt(10);
        System.out.println(randomInt2);
        //Generar rangos(entre 5 y 10)
        int randomInt3 = 5 + random.nextInt(10-5+1);
        System.out.println(randomInt3);

        //Obtener items aleatorios de un array
        String [] colors = {"amarillo", "rojo", "negro", "azul"};
        int itemRandom = random.nextInt(colors.length);
        System.out.println(colors[itemRandom]);

    }
}
