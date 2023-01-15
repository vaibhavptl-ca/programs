package com.vaibhav.samples.spotify;

public class LeapYear {


    public static void main(String[] args){

        System.out.println(leapYear(2018));

    }

    public static boolean leapYear(int year){
        boolean isLeapYear = false;

        if(year%4 == 0){

            if(year%100 == 0){

                if(year % 400 == 0){
                    isLeapYear = true;
                }
                else {
                    isLeapYear = false;
                }
            }
            else{
                isLeapYear = true;

            }
        }
        return isLeapYear;
    }
}
