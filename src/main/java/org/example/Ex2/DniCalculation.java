package org.example.Ex2;

public class DniCalculation {

    public static char calculateDniLetter(int number) {

        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letters[number % 23];
    }
}