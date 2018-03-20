/**
 * (c) Midland Software Limited 2018
 * Name     : CalculateSquare.java
 * Author   : ferraciolliw
 * Date     : 20 Mar 2018
 */
package com.wiltech.codechallenge.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The type Calculate square. This is a method that takes the following input.
 * The first line contains the number of queries to be performed.
 * The following will contain the value of a, b and the number to loop n.
 *
 * <l>https://www.hackerrank.com/challenges/java-loops/problem Java loops II</l>
 *
 * The formula (a+ 2^0*b), (a + 2^0*b + 2^1*b + 2^2*b + ... + 2^n-1*b )...
 */
public class CalculateSquare {
    /**
     * The entry point of application.
     * @param argh the input arguments
     */
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        //create a list tro hold the query details
        List<Query> sValues = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sValues.add(new Query(in.nextInt(), in.nextInt(), in.nextInt()));
        }

        //formula (a+ 2o*b), (a + 2o*b + 2i*b)...
        //List<Integer>
        for (Query q : sValues) {
            for (int i = 0; i < q.getN(); i++) {
                int result = q.getA();
                //loop through the value of i
                for (int j = 0; j <= i; j++) {
                    result = result + calculatePowerOf(2, j) * q.getB();
                }
                System.out.print(result);
            }
            in.close();
        }
    }

    /**
     * Calculate power of int.
     * @param value the value
     * @param exponent the exponent
     * @return the int
     */
    static int calculatePowerOf(int value, int exponent) {
        return (int) Math.pow(value, exponent);
    }

}

/**
 * The type Query.
 */
class Query {
    int a, b, n;

    /**
     * Instantiates a new Query.
     * @param a the a
     * @param b the b
     * @param n the n
     */
    public Query(final int a, final int b, final int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getN() {
        return n;
    }
}

