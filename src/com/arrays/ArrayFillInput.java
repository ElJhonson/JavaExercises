package com.arrays;

import javax.swing.*;
import java.util.Scanner;

public class ArrayFillInput {

    //Let's to fill our int array with our own numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numFill = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want to register?"));

        int[] numbers = new int[numFill];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ":");
            numbers[i] = input.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
