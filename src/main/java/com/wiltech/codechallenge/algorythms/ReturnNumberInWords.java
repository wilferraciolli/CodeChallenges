/**
 * (c) Midland Software Limited 2018
 * Name     : ReturnNumberInWords.java
 * Author   : ferraciolliw
 * Date     : 27 Jul 2018
 */
package com.wiltech.codechallenge.algorythms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You're practicing writing numbers in word form, according to the following rules:
 * The first letter is capitalized
 * Hyphenated words are used for numbers under 100 (eg: "Thirty-two")
 * Given an integer number, return a string representing the number in word form.
 * Examples
 * For number = 1, the output should be numberInWords(number) = "One".
 * For number = 12, the output should be numberInWords(number) = "Twelve".
 * For number = 14, the output should be numberInWords(number) = "Fourteen".
 * For number = 21, the output should be numberInWords(number) = "Twenty-one".
 * For number = 299, the output should be numberInWords(number) = "Two hundred ninety-nine".
 * For number = 123456, the output should be numberInWords(number) = "One hundred twenty-three thousand four hundred fifty-six".
 */
public class ReturnNumberInWords {

    static Map<Integer, String> defaultValues = new HashMap<>();
    static List<Integer> valuesToCalculate = new ArrayList<>();
    static int thousands;
    static int hundreds;
    static int tens;

    static StringBuilder finalResult = new StringBuilder();

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {

        System.out.println(numberInWords(10099));
    }

    static String numberInWords(int number) {
        int remainder;
        //find out the values
        if (number >= 1000) {
            //calculate if values are bigger than 1000
            remainder = calculateTheThousandsAndGetTheRemainder(number);

            if (remainder >= 100) {
                remainder = calculateTheHundredsAndGetTheRemainder(remainder);
            } else {
                remainder = calculateTheHundredsAndGetTheRemainder(remainder);
            }
        } else if (number >= 100) {
            //calculate if values are bigger than 100
            remainder = calculateTheHundredsAndGetTheRemainder(number);
        } else {
            remainder = number;
        }

        tens = remainder;

        //calculate values
        if (thousands > 0) {
            finalResult.append("t=" + thousands);
        }
        if (hundreds > 0) {
            finalResult.append("h=" + hundreds);
        }
        if (tens > 0) {
            finalResult.append("t=" + tens);
        }

        return finalResult.toString();
    }

    private static Integer calculateTheHundredsAndGetTheRemainder(int hundredsToDivide) {
        hundreds = hundredsToDivide / 100;

        return hundredsToDivide % 100;
    }

    public static Integer calculateTheThousandsAndGetTheRemainder(int thousandsToDivide) {
        thousands = thousandsToDivide / 1000;

        return thousandsToDivide % 1000;
    }

    public static void populateDefaultValues() {

        defaultValues.put(1, "one");
        defaultValues.put(2, "two");
        defaultValues.put(3, "three");
        defaultValues.put(4, "four");
        defaultValues.put(5, "five");
        defaultValues.put(6, "six");
        defaultValues.put(7, "seven");
        defaultValues.put(8, "eight");
        defaultValues.put(9, "nine");
        defaultValues.put(10, "ten");
        defaultValues.put(11, "eleven");
        defaultValues.put(12, "twelve");
        defaultValues.put(13, "thirteen");
        defaultValues.put(14, "fourteen");
        defaultValues.put(15, "fifteen");
        defaultValues.put(16, "sixteen");
        defaultValues.put(17, "seventeen");
        defaultValues.put(18, "eighteen");
        defaultValues.put(19, "nineteen");
        defaultValues.put(20, "twenty");
        defaultValues.put(30, "thirty");
        defaultValues.put(40, "forty");
        defaultValues.put(50, "fifty");
        defaultValues.put(60, "sixty");
        defaultValues.put(70, "seventy");
        defaultValues.put(80, "eighty");
        defaultValues.put(90, "ninety");
        defaultValues.put(100, "hundred");
        defaultValues.put(1000, "thousand");
    }

    /**
     * Hyphenate word if two words less than one hundred string.
     * @param value the value
     * @return the string
     */
    public static String hyphenateWordIfTwoWordsLessThanOneHundred(String value) {
        String result = "";
        //add hyphen if value is less than 100
        if (Integer.valueOf(value) > 20 && Integer.valueOf(value) < 100) {
            result = value.replace(" ", "-");
        }

        return result;
    }

    /**
     * Convert first letter to capital string.
     * @param value the value
     * @return the string
     */
    public static String convertFirstLetterToCapital(String value) {
        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }
}
