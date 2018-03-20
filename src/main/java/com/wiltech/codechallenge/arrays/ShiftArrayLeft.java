/**
 * (c) Midland Software Limited 2018
 * Name     : ShiftArrayLeft.java
 * Author   : ferraciolliw
 * Date     : 20 Mar 2018
 */
package com.wiltech.codechallenge.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The type Shift array left.
 * Shift array to the left.
 * The first on the first line value tells how many numbers the array should have.
 * The second on the first line contains how many numbers to shift to the left.
 * The second line contains the numbers on the array.
 * <l>https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem</l>Arrays: Left Rotation
 */
public class ShiftArrayLeft {

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int arraySize = 5;
        int shiftBy = 4;
        int values[] = {1, 2, 3, 4, 5};

        //        Scanner in = new Scanner(System.in);
        //        int arraySize = in.nextInt();
        //        int shiftBy = in.nextInt();
        //        int values[] = new int[arraySize];
        //
        //        //populate the array
        //        for (int a_i = 0; a_i < arraySize; a_i++) {
        //            values[a_i] = in.nextInt();
        //        }

        //loop through until shiftBy
        for (int i = 0; i < shiftBy; i++) {
            int temp = values[0] == 0 ? values[0] : values[0];
            //shift every element
            for (int j = 0; j < arraySize - 1; j++) {
                values[j] = values[j + 1];
            }
            values[arraySize - 1] = temp;
        }
        Arrays.stream(values).forEach(v ->System.out.print(v + " "));
    }
}
