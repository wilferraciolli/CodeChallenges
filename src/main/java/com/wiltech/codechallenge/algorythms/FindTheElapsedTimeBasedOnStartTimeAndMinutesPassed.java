/**
 * (c) Midland Software Limited 2018
 * Name     : FindTheElapsedTimeBasedOnStartTimeAndMinutesPassed.java
 * Author   : ferraciolliw
 * Date     : 29 May 2018
 */
package com.wiltech.codechallenge.algorythms;


/**
 * The type Find the elapsed time based on start time and minutes passed.
 */
public class FindTheElapsedTimeBasedOnStartTimeAndMinutesPassed {

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        lateRide(1439);
    }

    /**
     * Late ride int.
     * @param n the n
     * @return the int
     */
    static int lateRide(int n) {

        //get the hours and minutes as double
        String hours = String.valueOf(n / 60);
        String minutes = String.valueOf(n % 60);

        System.out.println("The formatted values are: " + formatHours(Integer.valueOf(hours), Integer.valueOf(minutes)));
        String digitalFormat = formatHours(Integer.valueOf(hours), Integer.valueOf(minutes));

        int result = addValues(digitalFormat);
        System.out.println(result);
        return result;
    }

    /**
     * Format hours string. This gets the hours and minutes and add them on the format of HHmm
     * @param hours the hours
     * @param minutes the minutes
     * @return the string
     */
    static String formatHours(int hours, int minutes) {
        return String.format("%02d", hours) + String.format("%02d", minutes);
    }

    /**
     * Add values int.
     * @param digitalFormat the digital format
     * @return the int
     */
    static int addValues(String digitalFormat) {
        char[] chars = digitalFormat.toCharArray();
        int sum = 0;

        for (int i = 0; i < chars.length; i++) {
            sum += Character.getNumericValue(chars[i]);
        }
        return sum;
    }
}


