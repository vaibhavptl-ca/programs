package com.vaibhav.samples.interview_prep;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total days the average temperature you'd like to check for");
        int numDays = sc.nextInt();
        int[] temperaturesForDays = new int[numDays];

        // record temperature and find average
        int sum = 0;
        for(int i = 0; i<numDays; i++){
            System.out.println("Enter the temperature for Day : "+ i + " 's high temp:");
            temperaturesForDays[i] = sc.nextInt();
            sum += temperaturesForDays[i];
        }
        double average = sum/numDays;
        int above = 0;
        for(int i = 0; i <temperaturesForDays.length; i++){
            if(temperaturesForDays[i] > average){
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temperature = "+average);
        System.out.println(above + " Number of days above average");

    }
}
