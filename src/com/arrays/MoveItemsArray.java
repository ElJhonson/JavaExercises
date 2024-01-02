package com.arrays;

public class MoveItemsArray {
    //Here I'm going to move up one position my items of my array of numbers
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int aux = numbers[numbers.length - 1];

        for (int i = numbers.length - 2; i >= 0; i--) {
            numbers[i + 1] = numbers[i];
        }
        numbers[0] = aux;


        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
