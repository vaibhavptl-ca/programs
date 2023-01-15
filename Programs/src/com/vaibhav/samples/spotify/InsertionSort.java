package com.vaibhav.samples.spotify;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){

        int[] arr = {35,1,5,16,3,9,12};
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr){

        int current, j;

        for(int i = 0 ; i<arr.length; i++){

            current = arr[i];

            j = i;

            while (j>0 && arr[j-1]>current){

                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = current;
        }

        System.out.println(Arrays.toString(arr));
    }
}
