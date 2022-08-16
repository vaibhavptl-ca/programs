package com.vaibhav.samples.prep;

public class AddDigits {

    public static void main(String[] args){
        System.out.println(add(38));
        isPalindrome(12321);
    }

    public static int add(int num){

        while (num >= 10){
            int temp = 0;

            while (num > 0) {
                int pop = num % 10;
                temp = temp + pop;
               num = num / 10;
           }
            num = temp;
        }
        return num;
    }

    public static boolean isPalindrome(int x){
        if(x < 0  || (x%10 == 0 && x!=0)){
            return false;
        }

        int temp = 0;

        while (x > temp){
            int pop = x %10;
            temp = temp * 10 + pop;
            x = x/10;
        }
        return x == temp || x == temp/10;
    }
}
