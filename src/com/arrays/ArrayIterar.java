package com.arrays;

public class ArrayIterar {
    public static void main(String[] args) {
        int[] numeros =  new int[5];

        numeros[0] = 19;
        numeros[1] = 27;
        numeros[2] = 32;
        numeros[3] = 24;
        numeros[4] = 6;

        // ----- Usando for ------
        System.out.println();
        int longitud = numeros.length;
        for (int i = 0; i<longitud; i++){
            System.out.println(numeros[i]);
        }

        // ----- Usando foreach ------
        System.out.println();
        for (int numero :
                numeros) {
            System.out.println(numero);
        }

        // ----- Usando while -----
        System.out.println();
        int i = 0;
        while (i<longitud){
            System.out.println(numeros[i]);
            i++;
        }

        // ----- Usando do while -----
        System.out.println();
        int j = 0;
        do {
            System.out.println(numeros[j]);
            j++;
        }while (j<longitud);

        //----- Iterar al revs -----
        //Al restarle 1 a la longitud del array nos estamos poniendo en la última posición
        System.out.println();
        for (int n = 0; n < longitud; n++) {
            System.out.println(numeros[longitud-1-n]);
        }

        //----- Iterar al revés 2 -----
        System.out.println();
        for (int m = numeros.length -1; m >= 0; m--) {
            System.out.println(numeros[m]);
        }

    }
}
