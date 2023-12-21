package com.arrays;

public class ArrayFill {
    public static void main(String[] args) {

        //Creamos array
        int[] numeros = new int[20];

        //Lo vamos a llenar por medio de un loop

        //for (con multiplos de 3)
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i*3;
        }

        //Mostramos
        System.out.println();
        for (int h: numeros){
            System.out.println(h);
        }
//------------------------------------------------------------------------


        //foreach (con multiplos de 3)
        int indice = 0;
        int contador = 0;

        for (int numero: numeros) {
            numeros[indice++] = (contador++)*3;
        }

        //Mostramos
        System.out.println();
        for (int j: numeros) {
            System.out.println(j);
        }

//---------------------------------------------------------------------
        //while (con multiplos de 3)
        int i = 0;
        while (i<numeros.length){
            numeros[i] = i*3;
            i++;
        }

        //Mosteamos
        System.out.println();
        for (int k: numeros){
            System.out.println(k);
        }
//-------------------------------------------------------------------
            //do while (con multiplos de 3)
            int j = 0;
            do {
                numeros[j] = j*3;
                j++;
            }while (j<numeros.length);

        //Mosteamos
        System.out.println();
        for (int l: numeros){
            System.out.println(l);
        }

    }
}
