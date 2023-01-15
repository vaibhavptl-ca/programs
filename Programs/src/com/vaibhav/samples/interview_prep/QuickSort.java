package com.vaibhav.samples.interview_prep;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args){


        int[] arr = {50,25,119,41,62,21,65,84,33,21};

        sort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int lower,int upper){

        if(lower<upper){

            int location = partition(arr, lower, upper);

            sort(arr,lower,location-1);
            sort(arr,location+1,upper);
        }

    }

    public static int partition(int[] arr, int lowerBound,int upperBound){

        int pivot = arr[lowerBound];
        int start = lowerBound;
        int end = upperBound;

        while (start< end) {
            while (arr[start] <= pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if (start < end) {
                swap(arr,start,end);
            }
        }
        swap(arr,lowerBound,end);

        return end;
    }
    public static void swap(int[] arr , int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
