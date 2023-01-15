package com.vaibhav.samples.interview_prep;

public class EvenOdd {

    public static void main(String[] args){
        evenOrOdd(549876122);
    }

    public static void evenOrOdd(int num){
        int even = 0;
        int odd = 0;


        while (num > 0){

            int remainder = num % 10;

            if(remainder %2 == 0){
                even++;
            }else {
                odd++;
            }
            num = num/10;
        }

        System.out.println("Even count is : "+ even);
        System.out.println("Odd count is : "+ odd);
    }
}
