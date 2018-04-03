/**
 * (c) Midland Software Limited 2018
 * Name     : FindOppositeValueInCircle.java
 * Author   : ferraciolliw
 * Date     : 03 Apr 2018
 */
package com.wiltech.codechallenge.algorythms;

/**
 * Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighbouring numbers is equal (note that 0 and n - 1 are neighbouring, too).
 * Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.
 * Example
 * For n = 10 and firstNumber = 2, the output should be
 * circleOfNumbers(n, firstNumber) = 7.
 * <link>https://codefights.com/arcade/code-arcade/intro-gates/vExYvcGnFsEYSt8nQ/description</link>
 */
public class FindOppositeValueInCircle {

    public static void main(String... args) {
        int numberOfValues = 10;
        int numberToFindOppositeOf = 2;
        int expectedValue = 7;

        System.out.println(circleOfNumbers(numberOfValues, numberToFindOppositeOf));
        // System.out.println(circleOfNumbers(4, 2));
        System.out.println(circleOfNumbers(10, 7));
    }

    /**
     * Circle of numbers int.
     * @param n the n
     * @param firstNumber the first number
     * @return the int
     */
    static int circleOfNumbers(int n, int firstNumber) {
        //find the half sum of the number of values and add 1 to it because index starts at 0
        int halfNumberValue = (n / 2);

        //check that the firstNumber is less than half
        if (firstNumber >= halfNumberValue) {
            //loop around the circle and get the modulus. This will invert the circle as it went pass the half
            return (halfNumberValue + firstNumber) % n;
        } else {
            //add the half to the index and that has to be the opposite value
            return halfNumberValue + firstNumber;
        }

    }

}
