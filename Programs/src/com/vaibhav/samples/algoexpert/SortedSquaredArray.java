package com.vaibhav.samples.algoexpert;

import java.util.Arrays;

public class SortedSquaredArray {

    public static void main(String[] args){

        int[] arr = {1,2,3,5,6,8,9};
        sortedSquaredArray(arr);
        System.out.println(Arrays.deepToString(new int[][]{arr}));
    }

    public static int[] sortedSquaredArray(int[] array) {

        int values;
        int[] resultArray = new int[array.length];

        for(int i = 0 ; i < array.length; i++){
            values = array[i];
            System.out.println("values : "+ values );
            System.out.println("array : "+ array[i]);
            System.out.println(i);
            resultArray[i] = values * values;

        }
        Arrays.sort(resultArray);
        System.out.println(Arrays.deepToString(new int[][]{resultArray}));

        return resultArray;
    }
}
