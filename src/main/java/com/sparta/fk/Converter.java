package com.sparta.fk;

public class Converter {


    private static final String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};// array of roman numeral symbols
    private static final int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; //array of corresponding numbers


    public static String convertToRoman(int arabicNumber) {

        StringBuilder romanNumeral = new StringBuilder();// string builder of roman numeral
        int i = 0; //start from 0 in array
        if (arabicNumber == 0) {
            return "Nulla"; // message if the number is 0
        } else while (arabicNumber > 0) {
            if (arabicNumber >= numbers[i]) {
                romanNumeral.append(numerals[i]); // build up numeral
                arabicNumber -= numbers[i];
            } else {
                i++;
            }
        }

        return romanNumeral.toString();
    }
}







