package com.wiltech.codechallenge.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The type Find first non repeatable character.
 * Given a string s, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.
 */
public class FindFirstNonRepeatableCharacter {

    public static void main(String args[]) {
        //the output should be 'c'
        System.out.println(firstNotRepeatingCharacter("abacabad"));

        //the output should be'_'
        System.out.println(firstNotRepeatingCharacter("abacabaabacaba"));
    }


    /**
     * First not repeating character char.
     *
     * @param s the s
     * @return the char
     */
    static char firstNotRepeatingCharacter(String s) {
        //create a linked hash map to preserve the order of the strings. then save them with their count
        LinkedHashMap<String, Integer> hash = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!hash.containsKey(String.valueOf(s.charAt(i)))) {
                //add 1 to the counter
                hash.put(String.valueOf(s.charAt(i)), new Integer(1));
            } else {
                //add to the hash
                hash.put(String.valueOf(s.charAt(i)), hash.get(String.valueOf(s.charAt(i))) + 1);
            }
        }

        for (Map.Entry<String, Integer> f : hash.entrySet()) {
            if (f.getValue() == 1) {
                return f.getKey().charAt(0);
            }
        }
        return '_';
    }
}
