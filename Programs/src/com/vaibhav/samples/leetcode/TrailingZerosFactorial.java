package com.vaibhav.samples.leetcode;

public class TrailingZerosFactorial {

    public static void main(String[] args){

        System.out.println(trailZeros(100));
    }

    public static int trailZeros(int n){
        int count  = 0;
        while (n > 0){
            n /= 5;
            count+=n;
        }
        return count;
    }
}
