package com.arrays;

public class InsertionSortArray {
    public static void main(String[] args) {
        String[] names = {"Lalo", "Alita", "Laura", "Luis", "Oscar", "Renata"};
        int size = names.length;
        String aux;
        int pos;


        for (int i = 0; i < size; i++) {
            pos = i;
            aux = names[i];

            while ((pos > 0) && (names[i - 1].compareTo(aux) > 0)) {
                names[pos] = names[pos - 1];
                pos--;
            }
            names[pos] = aux;
        }

        for (String name : names) {
            System.out.println(name);
        }
    }

}
