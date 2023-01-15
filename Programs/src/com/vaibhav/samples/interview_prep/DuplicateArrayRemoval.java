package com.vaibhav.samples.interview_prep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArrayRemoval {

    public static void main(String[] args){
        int[] arr = {5,3,4,5,5,4,9,7,6,9};



        sortedRemoval();
//        removeByHashSet(arr);
    }

    public static void removeByHashSet(int[] arr){

        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr.length; i++){
            set.add(arr[i]);
        }

        Integer[] integers = set.toArray(new Integer[(set.size())]);

        System.out.println(Arrays.deepToString(integers));

    }

    public static void sortedRemoval(){
        int[] arr = {3,4,4,5,5,5,6,7,9,9};
        int j = 0;

        for(int i = 0 ; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                    arr[j] = arr[i];
                    j++;
                }
        }

        arr[j] = arr[arr.length-1];

        for(int k = 0; k <=j; k++){
            System.out.print(arr[k]+ " ");
        }


    }
}
