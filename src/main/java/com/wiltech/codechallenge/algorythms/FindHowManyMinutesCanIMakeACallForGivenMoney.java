/**
 * (c) Midland Software Limited 2018
 * Name     : FindHowManyMinutesCanIMakeACallForGivenMoney.java
 * Author   : ferraciolliw
 * Date     : 30 May 2018
 */
package com.wiltech.codechallenge.algorythms;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The type Find how many minutes can i make a call for given money.
 * Some phone usage rate may be described as follows:
 * first minute of a call costs min1 cents,
 * each minute from the 2nd up to 10th (inclusive) costs min2_10 cents
 * each minute after 10th costs min11 cents.
 * You have s cents on your account before the call. What is the duration of the longest call (in minutes rounded down to the nearest integer) you can have?
 * @see <a href=https://codefights.com/arcade/code-arcade/intro-gates/mZAucMXhNMmT7JWta> CodeFights::Phone Call</a>
 */
public class FindHowManyMinutesCanIMakeACallForGivenMoney {

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {

        // int i = phoneCall(10, 1, 2, 22);
        int i = phoneCall(1, 2, 1, 6);
        // int i = phoneCall(3, 1, 2, 20);
        System.out.println("The value should be 11 = " + i);
        // System.out.println("The value should be 11 = " + allowedMinutes);
    }

    /**
     * Phone call int. This method will return the minutes a person can have a call based on credit given (rounded to the nearest int.
     * @param firstMinuteValue the first minute value
     * @param minutesTwoToTenValue the minutes two to ten value
     * @param minutesAfterTenValue the minutes after ten value
     * @param creditAmount the credit amount
     * @return the int
     */
    static int phoneCall(int firstMinuteValue, int minutesTwoToTenValue, int minutesAfterTenValue, int creditAmount) {
        int allowedMinutes = 0;

        //calculate first minute
        double creditAmountLeftAfterAMinute = creditAmount - firstMinuteValue;
        if (creditAmountLeftAfterAMinute < 0) {
            return 0;
        } else {
            allowedMinutes++;
        }

        //calculate 2-10
        double twoToTenMinutesCost = minutesTwoToTenValue * 9;
        double creditAmountLeftAfterTwoToTen = creditAmountLeftAfterAMinute - twoToTenMinutesCost;
        if (creditAmountLeftAfterTwoToTen < 0) {
            int minutesToTalk = (int) creditAmountLeftAfterAMinute / minutesTwoToTenValue;
            double minutesToTalkRemainder = creditAmountLeftAfterAMinute % minutesTwoToTenValue;

            allowedMinutes += minutesToTalk;
            allowedMinutes += roundToNearestInt(minutesToTalkRemainder / minutesTwoToTenValue);

            return allowedMinutes;
        } else {
            allowedMinutes += 9;
        }

        //calculate after 10
        int minutesToTalk = (int) creditAmountLeftAfterTwoToTen / minutesAfterTenValue;
        double minutesToTalkRemainder = creditAmountLeftAfterTwoToTen % minutesAfterTenValue;

        allowedMinutes += minutesToTalk;
        allowedMinutes += roundToNearestInt(minutesToTalkRemainder / minutesAfterTenValue);

        return allowedMinutes;
    }

    /**
     * Round to nearest int int. Eg 1.2 = 1, 1.5=1, 1.6=2...
     * @param valueToRound the value to round
     * @return the int
     */
    static int roundToNearestInt(double valueToRound) {
        return new BigDecimal(valueToRound).setScale(0, RoundingMode.HALF_DOWN)
                .intValue();
    }

}
