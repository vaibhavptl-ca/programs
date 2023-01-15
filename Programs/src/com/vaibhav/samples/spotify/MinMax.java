package com.vaibhav.samples.spotify;

public class MinMax {
    public static void main(String[] args){

        int[] a = {1,4,5,2,3};


        int max = a[0];
        int min = a[0];

        for(int i = 0; i <a.length; i++){

            if(max < a[i]){
                max = a[i];
            }
            if(min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Max is "+ max + " and Min is "+min);
    }

}
