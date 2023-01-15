package com.vaibhav.samples.interview_prep;

import java.util.Arrays;

public class ArrayPlusOne {

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(Arrays.deepToString(new int[][]{plusOne(digits)}));

    }

    public static int[] plusOne(int[] digits){

        int carry = 1;
        for(int i  = digits.length-1; i>=0; i--){
            int current = digits[i] + carry;
            if(current >= 10){
                carry = 1;
                digits[i] = current %10;
            }
            else
            {
                carry = 0;
                digits[i] = current;
            }
        }

        if(carry == 1){
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
}

