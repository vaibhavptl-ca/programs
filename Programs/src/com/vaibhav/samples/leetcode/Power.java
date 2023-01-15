package com.vaibhav.samples.leetcode;

public class Power {

    public static void main(String[] args) {
        System.out.println(power(2.0,14));
    }

    public static double power(double x, int n){
        double ans = 1.0;
        long num = n;

        if(n < 0){
            num = -1 * num;
        }

        while (num > 0){
            if(num % 2 == 0){
                x = x*x;
                num=num/2;
            }
            else {
                ans = ans * x;
                num = num - 1;
            }
        }

        if( n < 0 ){
            return (double)(1.0)/ (double)(ans);
        }
        return ans;
    }
}
