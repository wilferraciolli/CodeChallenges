/**
 * (c) Midland Software Limited 2018
 * Name     : RansomNote.java
 * Author   : ferraciolliw
 * Date     : 21 Mar 2018
 */
package com.wiltech.codechallenge.hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class creates checks whether the words that a user wants to use is within a magazine, so he can crop and paste it.
 * <l>https://www.hackerrank.com/challenges/ctci-ransom-note/problem</l>
 */
public class RansomNote {

    public static void main(String... args) {
        //        Scanner in = new Scanner(System.in);
        //        int m = in.nextInt();
        //        int n = in.nextInt();
        //        String magazine[] = new String[m];
        //        for(int magazine_i=0; magazine_i < m; magazine_i++){
        //            magazine[magazine_i] = in.next();
        //        }
        //        String ransom[] = new String[n];
        //        for(int ransom_i=0; ransom_i < n; ransom_i++){
        //            ransom[ransom_i] = in.next();
        //        }

        int m = 6;
        int n = 5;

        String magazine[] = {"two", "times", "three", "is", "not", "four"};
        String ransom[] = {"two", "times", "two", "is", "four"};

        List<String> magazineList = new ArrayList(Arrays.asList(magazine));
        List<String> ransomList = Arrays.asList(ransom);

        for (String word : ransomList) {
            if (!magazineList.remove(word)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}
