package com.vaibhav.samples.interview_prep;

public class RemainderWithoutMod {

    public static void main(String[] args){
        int a = 10;
        int b = 3;
        System.out.println(remainder(a,b));
    }

    public static int remainder(int a, int b){
        int dividend = a/b;

        int remainder = a - (dividend*b);

        return remainder;
    }
}
