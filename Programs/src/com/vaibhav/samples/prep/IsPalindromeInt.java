package com.vaibhav.samples.prep;

public class IsPalindromeInt {


    public static void main(String[] args){

        System.out.println(isPalindrome(12344321));
    }
//    public boolean isPalindrome(int x) {
//        if(x < 0 || (x%10 == 0 && x!=0)){
//            return false;
//        }
//
//        int revertedNum = 0;
//        while( x > revertedNum){
//            int pop = x % 10;
//            revertedNum = revertedNum * 10 + pop;
//            x /= 10;
//        }
//
//        return x == revertedNum || x == revertedNum/10;
//    }

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

