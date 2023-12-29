package com.arrays;

import java.util.Scanner;

public class SearchArrayItem {
    public static void main(String[] args) {
        String[] names = new String[5];

        Scanner input = new Scanner(System.in);

        for (int j = 0; j < names.length; j++) {
            System.out.println("Type the name number:  " + (j + 1));
            names[j] = input.next();
        }

        System.out.println("\r\nWhat name are you searching?");
        String searchName = input.next();

        int i = 0;
        while (i < names.length && !names[i].equalsIgnoreCase(searchName)) {
            i++;
        }

        if (i == names.length) {
            System.out.println("We didn't find the element");
        } else if (names[i].equalsIgnoreCase(searchName)) {
            System.out.println("Element found in the position number: " + i);
        }

    }
}
