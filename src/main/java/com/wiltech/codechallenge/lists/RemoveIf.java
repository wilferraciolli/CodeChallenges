/**
 * (c) Midland Software Limited 2018
 * Name     : RemoveIf.java
 * Author   : ferraciolliw
 * Date     : 23 Mar 2018
 */
package com.wiltech.codechallenge.lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Remove if. Given a singly linked list of integers l and an integer k, remove all elements from list l that have a value equal to k.
 */
public class RemoveIf {

    public static void main(String... args) {

        List<Integer> listToRemoveIf = Arrays.asList(3, 1, 2, 3, 4, 5);
        List<Integer> listWithRemovedInts = removeKFromList(listToRemoveIf, 3);

        //print all
        listWithRemovedInts.stream().forEach(System.out::print);
    }

    static List<Integer> removeKFromList(List<Integer> fullList, int k) {

        return fullList.stream()
                .filter(value -> !value.equals(new Integer(k)))
                .collect(Collectors.toList());
    }
}
