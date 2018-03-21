package com.wiltech.codechallenge.hashtables;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The type Find duplicate.
 */
public class FindDuplicate {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[]) {
        int[] a = {2, 3, 3, 1, 5, 8};

        System.out.println(firstDuplicate(a));

    }

    /**
     * First duplicate int.
     *
     * @param a the a
     * @return the int
     */
    static int firstDuplicate(int[] a) {
        //create a hash table for performance
        Set<Integer> map = new HashSet<Integer>();

        //loop through every value on the array
        for (int i = 0; i < a.length; i++) {
            if (!map.add(a[i])) {
                return a[i];
            }
        }
        return -1;
    }

}
