package com.vaibhav.samples.spotify;

public class MissingElement {
    public static void main(String[] args){

        int[] a = {1,2,3,4,6};

        int sumWithoutMissing = 0;

        for(int i = 1; i<= 6; i++){
            sumWithoutMissing +=i;
        }

        int sumWhenMissing = 0;

        for(int i = 0; i< a.length; i++){

            sumWhenMissing+= a[i];
        }

        int missedNumber = sumWithoutMissing - sumWhenMissing;

        System.out.println(missedNumber);
    }

}
