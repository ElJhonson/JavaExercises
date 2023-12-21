package com.mathclass;

public class MathRandomClass {
    public static void main(String[] args) {

        //Creamos nuestra instancia de nuestra clase
        double random = Math.random();
        //La imprimimos de esta manera para poder tener numerous entre 0 y 100, pero normalmente los da entre 0 y 1
        System.out.println("random = " + Math.round(random*100));

        //Ejemplo para obtener items aleatorios de una lista
        String [] colors = {"amarillo", "rojo", "negro", "azul"};
        random *= colors.length;
        System.out.println(colors[(int) random]);

        //Con esto hacemos que nos dé numeros hasta el numero 7, sin contarlo(Se puede con cualquier numero)
        random *= 7;
    }
}
