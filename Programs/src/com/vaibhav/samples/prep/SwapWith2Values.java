package com.vaibhav.samples.prep;

public class SwapWith2Values {

    public static void main(String[] args){
        int a  = 10;
        int b = 20;
        swap(a,b);
        System.out.printf("a is %d, b is %d", a, b);
    }

    public static void swap(int a , int b){
        b = b + a;
        a = b - a;
        b = b - a;
    }
}
