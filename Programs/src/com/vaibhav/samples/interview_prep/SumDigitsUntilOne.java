package com.vaibhav.samples.interview_prep;


/**
 *
 * We're provided a positive integer num. Can you write a method to repeatedly add all of its digits until the result has only one digit?
 *
 * Here's an example: if the input was 49, we'd go through the following steps:
 *
 * SNIPPET
 * // start with 49
 * 4 + 9 = 13
 *
 * // since the previous addition was 13,
 * // move onto summing 13's digits
 * 1 + 3 = 4
 *
 */
public class SumDigitsUntilOne {
    public static void main(String[] args){
        int i = sumUntilOneLastDigit(55);
        System.out.println(i);
    }


    public static int sumUntilOneLastDigit(int num){

        while (num >= 10) {
            int temp = 0;
            while (num > 0) {
                int pop = num % 10;
                temp = temp + pop;
                num = num / 10;
            }
            num = temp;
        }
        return num;
    }

}
