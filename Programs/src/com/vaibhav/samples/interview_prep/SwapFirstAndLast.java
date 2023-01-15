package com.vaibhav.samples.interview_prep;

import java.util.Arrays;

public class SwapFirstAndLast {

    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        swap(arr);
    }

    public static void swap(int[] arr){

        int size = arr.length;
        int temp;

            temp = arr[0];
            arr[0] = arr[size-1];
            arr[size-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
