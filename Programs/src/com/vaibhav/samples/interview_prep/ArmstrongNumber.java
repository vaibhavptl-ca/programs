package com.vaibhav.samples.interview_prep;

public class ArmstrongNumber {

    public static void main(String[] args){
        armstrongNum(153);
    }

    public static boolean armstrongNum(int num){

        int cubedNumber = 0;
        int orignalNum = num;
        while (num > 0){

            int remainder = num %10;

            cubedNumber = cubedNumber + (remainder*remainder*remainder);

            num = num/10;

        }
        if(orignalNum != cubedNumber){
            System.out.println("Number is not Armstrong Number");
            return true;
        }
        System.out.println("Armstrong Number");
        return true;
    }
}
