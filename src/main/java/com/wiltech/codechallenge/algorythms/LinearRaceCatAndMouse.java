/*
 * (c) Midland Software Limited 2019
 * Name     : LinearRaceCatAndMouse.java
 * Author   : ferraciolliw
 * Date     : 25 Apr 2019
 */
package com.wiltech.codechallenge.algorythms;

import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * Two cats and a mouse are at various positions on a line. You will be given their starting positions. Your task is to determine which cat will reach the mouse first, assuming the mouse doesn't move and the cats travel at equal speed. If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.
 * You are given  queries in the form of , , and  representing the respective positions for cats  and , and for mouse . Complete the function  to return the appropriate answer to each query, which will be printed on a new line.
 * If cat  catches the mouse first, print Cat A.
 * If cat  catches the mouse first, print Cat B.
 * If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.
 * For example, cat  is at position  and cat  is at . If mouse  is at position , it is  units from cat  and unit from cat . Cat  will catch the mouse.
 * Function Description
 * Complete the catAndMouse function in the editor below. It should return one of the three strings as described.
 * catAndMouse has the following parameter(s):
 * x: an integer, Cat 's position
 * y: an integer, Cat 's position
 * z: an integer, Mouse 's position
 * Input Format
 * The first line contains a single integer, , denoting the number of queries.
 * Each of the  subsequent lines contains three space-separated integers describing the respective values of  (cat 's location),  (cat 's location), and  (mouse 's location).
 * Constraints
 * Output Format
 * For each query, return Cat A if cat  catches the mouse first, Cat B if cat  catches the mouse first, or Mouse C if the mouse escapes.
 * Sample Input 0
 * 2
 * 1 2 3
 * 1 3 2
 * Sample Output 0
 * Cat B
 * Mouse C
 */
public class LinearRaceCatAndMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        String mouseWon = "Mouse C";
        String catAWon = "Cat A";
        String catBWon = "Cat B";

        int catADistance = converNumberToPositiveIfNegative((z - x));
        int catBDistance = converNumberToPositiveIfNegative((z - y));

        if (catADistance == catBDistance) {
            return mouseWon;
        } else if (catADistance < catBDistance) {
            return catAWon;
        } else {
            return catBWon;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //        int q = scanner.nextInt();
        //        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //
        //        for (int qItr = 0; qItr < q; qItr++) {
        //            String[] xyz = scanner.nextLine().split(" ");
        //
        //            int x = Integer.parseInt(xyz[0]);
        //
        //            int y = Integer.parseInt(xyz[1]);
        //
        //            int z = Integer.parseInt(xyz[2]);
        //
        //            System.out.println(catAndMouse(x, y, z));

        //  bufferedWriter.write(result);
        //  bufferedWriter.newLine();
        System.out.println(catAndMouse(1, 2, 3));
    }

    // bufferedWriter.close();

    //        scanner.close();
    //    }

    public static int converNumberToPositiveIfNegative(int numberToConvert) {
        return numberToConvert < 0 ? -numberToConvert : numberToConvert;
    }
}
