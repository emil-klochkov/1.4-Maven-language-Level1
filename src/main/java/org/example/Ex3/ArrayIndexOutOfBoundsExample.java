package org.example.Ex3;

public class ArrayIndexOutOfBoundsExample {


    public static void triggerArrayIndexOutOfBoundsException() {
        int[] numbers = {1, 2, 3};

        System.out.println(numbers[5]);
    }
}