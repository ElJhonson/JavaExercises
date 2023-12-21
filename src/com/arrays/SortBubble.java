package com.arrays;

public class SortBubble {
    //bdjhdj
    public static void main(String[] args) {
        String[] names = {"Laura", "Lalo", "Luis", "Oscar", "Renata", "Alita", "Alejandra", "Nenata"};

        int longitud = names.length;

        for (int i = 0; i < longitud; i++) {

            for (int j = 0; j < longitud-1; j++) {

                if (names[j+1].compareTo(names[j])<0){
                    String name = names[j];
                    names[j] = names[j+1];
                    names[j+1] = name;
                }
            }
        }

        for (String name: names){
            System.out.println(name
            );
        }
    }
}
