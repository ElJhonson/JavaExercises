package com.ejercicios;

import javax.swing.*;

public class SplitMethod {
    public static void main(String[] args) {

        String name1 = JOptionPane.showInputDialog("Ingresa un nombre");
        String name2 = JOptionPane.showInputDialog("Ingresa otro nombre");
        String name3 = JOptionPane.showInputDialog("Ingresa otro nombre");

        String [] name1Split = name1.split(" ");
        String [] name2Split = name2.split(" ");
        String [] name3Split = name3.split(" ");

        String firstComparative = name1Split[0].length() > name2Split[0].length()?name1Split[0]:
                name2Split[0];

        String result = name3Split[0].length() > firstComparative.length()? name3Split[0] + " Tiene el nombre mas largo":
                firstComparative + " Tie ne el nombre mas largo";


        System.out.println(result);
    }
}
