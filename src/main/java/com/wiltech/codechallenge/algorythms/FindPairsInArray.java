package com.wiltech.codechallenge.algorythms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Stream;

/**
 * The type Find pairs in array.
 * John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 * For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
 * Function Description
 * Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
 * sockMerchant has the following parameter(s):
 * n: the number of socks in the pile
 * ar: the colors of each sock
 * Input Format
 * The first line contains an integer , the number of socks represented in .
 * The second line contains  space-separated integers describing the colors  of the socks in the pile.
 * Constraints
 * where
 * Output Format
 * Return the total number of matching pairs of socks that John can sell.
 * Sample Input
 * 9
 * 10 20 20 10 10 30 50 10 20
 * Sample Output
 * 3
 * Explanation
 * sock.png
 * John can match three pairs of socks.
 */
public class FindPairsInArray {

    /**
     * Sock merchant int.
     * @param n the n
     * @param ar the ar
     * @return the int
     */
    static int sockMerchant(int n, int[] ar) {

        // 1,1,1,2

        final int[] numberOfPairs = {0};

        Set setOfNumbers = new HashSet();
        Arrays.stream(ar)
                .forEach(value -> {
                    //check that it already has the value
                    if (!setOfNumbers.add(value)) {
                        numberOfPairs[0]++;

                        //remove so another pair can taken place
                        setOfNumbers.remove(value);
                    }
                });

        System.out.println(numberOfPairs[0]);
        return numberOfPairs[0];

    }

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * The entry point of application.
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {

        sockMerchant(3, new int[] {1, 1, 1, 2});
        //        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        //
        //        int n = scanner.nextInt();
        //        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //
        //        int[] ar = new int[n];
        //
        //        String[] arItems = scanner.nextLine().split(" ");
        //        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //
        //        for (int i = 0; i < n; i++) {
        //            int arItem = Integer.parseInt(arItems[i]);
        //            ar[i] = arItem;
        //        }
        //
        //        int result = sockMerchant(n, ar);
        //
        //        bufferedWriter.write(String.valueOf(result));
        //        bufferedWriter.newLine();
        //
        //        bufferedWriter.close();
        //
        //        scanner.close();
    }

}
