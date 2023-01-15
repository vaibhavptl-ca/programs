package com.vaibhav.samples.interview_prep;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {

    public static void main(String[] args){

        Integer[] arr = {9,3,2,1,4,5,6,8,7};

        Arrays.sort(arr,Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));

    }

}
