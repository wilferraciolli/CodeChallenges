package com.wiltech.codechallenge.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed
 * <link>https://codefights.com/arcade/intro/level-2/bq2XnSr5kbHqpHGJC</link>
 * <p>
 * For statues = [6, 2, 3, 8], the output should be
 * makeArrayConsecutive2(statues) = 3.
 * <p>
 * Ratiorg needs statues of sizes 4, 5 and 7.
 */
public class MakeArrayConsecutive {

    public static void main(String args[]) {

        int values[] = {6, 2, 3, 8};

        System.out.println(findHowManyNeedAddingToMakeIncremental(values));

    }

    static int findHowManyNeedAddingToMakeIncremental(int[] values) {
        //convert the array on ints into a list
        List<Integer> valuesAsList = Arrays.stream(values).boxed().collect(Collectors.toList());

        //get the minimum and maximum
        int min = Collections.min(valuesAsList);
        int max = Collections.max(valuesAsList);
        List<Integer> valuesIncremented = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            valuesIncremented.add(i);
        }

        valuesAsList.forEach(System.out::println);
        return valuesIncremented.size() - valuesAsList.size();
    }


}
