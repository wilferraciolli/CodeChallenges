package com.wiltech.codechallenge.arrays;

/**
 * The type Find number of col and rows.
 * Given the total number of rows and columns in the theater (nRows and nCols, respectively), and the row and column you're sitting in, return the number of people who sit strictly behind you and in your column or to the left, assuming all seats are occupied.
 * <p>
 * Example
 * <p>
 * For nCols = 16, nRows = 11, col = 5 and row = 3, the output should be
 * seatsInTheater(nCols, nRows, col, row) = 96.
 */
public class FindNumberOfColAndRows {

    public static void main(String... arg) {
        System.out.println(valuesToBeDisturbedIfMoved(16, 11, 5, 3));
    }

    /**
     * Values to be disturbe if moved int.
     *
     * @param nCols the n cols
     * @param nRows the n rows
     * @param col   the col
     * @param row   the row
     * @return the int
     */
    static int valuesToBeDisturbedIfMoved(int nCols, int nRows, int col, int row) {

        int counter = 0;
        for (int i = 0; i <= nRows; i++) {
            for (int j = 0; j <= nCols; j++) {
                //if the row and column is bigger than current position add
                if (i > row && j >= col) {
                    counter++;
                }
            }
        }
        return counter;
    }


}
