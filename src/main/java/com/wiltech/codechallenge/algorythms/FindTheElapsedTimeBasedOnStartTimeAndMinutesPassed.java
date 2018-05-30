/**
 * (c) Midland Software Limited 2018
 * Name     : FindTheElapsedTimeBasedOnStartTimeAndMinutesPassed.java
 * Author   : ferraciolliw
 * Date     : 29 May 2018
 */
package com.wiltech.codechallenge.algorythms;

/**
 * The type Find the elapsed time based on start time and minutes passed.
 * One night you go for a ride on your motorcycle. At 00:00 you start your engine, and the built-in timer automatically begins counting the length of your ride, in minutes. Off you go to explore the neighborhood.
 * When you finally decide to head back, you realize there's a chance the bridges on your route home are up, leaving you stranded! Unfortunately, you don't have your watch on you and don't know what time it is. All you know thanks to the bike's timer is that n minutes have passed since 00:00.
 * Using the bike's timer, calculate the current time. Return an answer as the sum of digits that the digital timer in the format hh:mm would show.
 * @see <a href=https://codefights.com/arcade/code-arcade/intro-gates/aiKck9MwwAKyF8D4L>CodeFights::Late Ride</a>
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


