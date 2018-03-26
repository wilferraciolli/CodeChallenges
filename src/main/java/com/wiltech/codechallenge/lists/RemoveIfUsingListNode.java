/**
 * (c) Midland Software Limited 2018
 * Name     : RemoveIf.java
 * Author   : ferraciolliw
 * Date     : 23 Mar 2018
 */
package com.wiltech.codechallenge.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Remove if. Given a singly linked list of integers l and an integer k, remove all elements from list l that have a value equal to k.
 */
public class RemoveIfUsingListNode {

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String... args) {

        List<Integer> listToRemoveIf = Arrays.asList(3, 1, 2, 3, 4, 5);
        //  List<Integer> listWithRemovedInts = removeKFromList(listToRemoveIf, 3);

        //print all
        //  listWithRemovedInts.stream().forEach(System.out::print);
        // System.out.println(removeKFromList(listToRemoveIf, 1));
        ListNode<Integer> rawList = new ListNode<>(3);
        rawList.next = new ListNode<>(1);
        rawList.next.next = new ListNode<>(2);
        rawList.next.next.next = new ListNode<>(3);
        rawList.next.next.next.next = new ListNode<>(4);
        rawList.next.next.next.next.next = new ListNode<>(5);

        ListNode<Integer> result = removeKFromList(rawList, 3);
        System.out.println(result.value);
    }

    /**
     * Remove k from list list node.
     * @param fullList the full list
     * @param k the k
     * @return the list node
     */
    static ListNode<Integer> removeKFromList(ListNode<Integer> fullList, int k) {
        //return null if list is null   `1
        if (fullList == null) {
            return null;
        }

        ListNode helper = new ListNode(0);
        helper.next = fullList;
        ListNode previous = helper;

        while (previous.next != null) {
            //IF THE NEXT VALUE IS EQUALS TO K, THEN SKIP IT by assigning the next.next value tot he list
            if (previous.next.value.equals(k)) {
                ListNode next = previous.next;
                previous.next = next.next;
            } else {
                previous = previous.next;
            }
        }
        //return the list with all the values added without k
        return helper.next;
    }
}

/**
 * The type List node.
 * @param <T> the type parameter
 */
class ListNode<T> {
    T value;
    ListNode<T> next;

    /**
     * Instantiates a new List node.
     * @param x the x
     */
    ListNode(T x) {
        value = x;
    }

}
