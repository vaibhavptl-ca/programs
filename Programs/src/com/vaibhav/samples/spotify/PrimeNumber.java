package com.vaibhav.samples.spotify;

public class PrimeNumber {

    public static void main(String[] args){
        primeNumbers(13);
    }

    public static void primeNumbers(int num){

        boolean isPrimeNumber = true;
        if (num > 1){
            for(int i = 2; i < num ; i++){
                if(num % 2 == 0){
                    isPrimeNumber = false;
                   break;
                }

            }
        }
        else{
            isPrimeNumber = false;
        }

        if(isPrimeNumber){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }

}
