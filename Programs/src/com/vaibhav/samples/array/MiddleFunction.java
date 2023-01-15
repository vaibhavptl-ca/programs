package com.vaibhav.samples.array;

import java.util.Arrays;


/***
 *  Write a function called middle that takes a list and returns the new list that contains all but the first and last element
 *  myArray= [1,2,3,4]
 *  middle(myArray)
 *
 *  ----- Output == [2,3]
 *
 */
public class MiddleFunction {
    static int[] middle(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length-1);
    }
}
