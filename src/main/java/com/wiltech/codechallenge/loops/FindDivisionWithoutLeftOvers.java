package com.wiltech.codechallenge.loops;

/**
 * children have got m pieces of candy. They want to eat as much candy as they can, but each child must eat exactly the same amount of candy as any other child. Determine how many pieces of candy will be eaten by all the children together. Individual pieces of candy cannot be s
 */
public class FindDivisionWithoutLeftOvers {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[]) {

        int numberOfParts = 3;
        int numberOfInts = 10;

        System.out.println(findHowManyForEachWithoutLeftOvers(numberOfParts, numberOfInts));

    }

    private static int findHowManyForEachWithoutLeftOvers(int numberOfParts, int numberOfInts) {
        int result = numberOfInts / numberOfParts;
        return result * numberOfParts;
    }
}
