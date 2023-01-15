package com.vaibhav.samples.interview_prep;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

//        rotateArrayBy1(arr);
//        rotateArrayBy3(arr);
        leftRotateBy3(arr);
    }

    public static void rotateArrayBy1(int[] arr){

        int size = arr.length;
        int last = arr[size -1];
        for(int i = size-1; i>0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = last;

        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArrayBy3(int[] a){

        int size = a.length;
        int n = 3;
        for(int j=1;j<=n;j++) {
            int last = a[size-1];
            for(int i=size-1;i>0;i--) {
                a[i] = a[i-1];
            }
            a[0] = last;
        }
        System.out.println(Arrays.toString( a));

    }

    public static void leftRotateBy1(int[] a){
        int size = a.length;
        int first = a[0];

        for(int i = 0; i< size-1; i++){
            a[i] = a[i+1];
        }

        a[size-1] = first;

        System.out.println(Arrays.toString(a));
    }

    public static void leftRotateBy3(int[] a){
        int size = a.length;
        int n = 3;
        for(int j = 1 ;j <= n; j++) {
            int first = a[0];
            for (int i = 0; i < size - 1; i++) {
                a[i] = a[i + 1];
            }

            a[size - 1] = first;
        }
        System.out.println(Arrays.toString(a));
    }
}
