package com.vaibhav.samples.prep;

public class PrimeNumber {
    // Prime is a number that cannot be divided by any number except its own
    public static void main(String[] args){

        System.out.println(primeCheck(5));
        System.out.println(primeCheck(1));
        System.out.println(primeCheck(2));
        System.out.println(primeCheck(10));
        System.out.println(primeCheck(13));
        System.out.println(primeCheck(49));


    }

    static boolean primeCheck(int n){
        if(n == 0 || n == 1){
            return false;
        }
        else if(n == 2){
            return true;
        }
        for(int i = 2; i <= n/2 ; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
