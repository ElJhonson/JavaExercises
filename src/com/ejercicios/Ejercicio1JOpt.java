package com.ejercicios;

import javax.swing.*;

public class Ejercicio1JOpt {
    public static void main(String[] args) {
        float num1 = 0f;
        float num2 = 0f;

        float resultado = 0f;

//Suma de dos numeros utilizando JoptionPane
        try {
            num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa un numero: "));
            num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa otro numero: "));
            resultado = num1 + num2;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR\n Ingresa los datos solicitados");
            main(args);
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "El resultado de tu suma es: \n" + resultado);
    }
}
