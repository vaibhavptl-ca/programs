package com.vaibhav.samples.array;

import java.util.Arrays;

public class RearrangeArray {

    public static void main(String[] args){
        int[] arr = new int []{ 1, 2, 3, 4, 5, 6, 7 };
        int size = 7;
        rearrangeArr(arr, size);
    }

    private static void rearrangeArr(int[] arr, int size) {

        int even = size/2;
        int odd =  size - even;

        int[] tempArr = new int[size];

        for(int i=0 ; i< arr.length; i++)
            tempArr[i] = arr[i];

        Arrays.sort(tempArr);

        int j = odd - 1;

        for(int k = 0 ; k < size ;  k+=2){
            arr[k] = tempArr[j];
            j--;
        }

        j = odd;

        for (int i = 1; i < size; i += 2) {
            arr[i] = tempArr[j];
            j++;
        }

        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
