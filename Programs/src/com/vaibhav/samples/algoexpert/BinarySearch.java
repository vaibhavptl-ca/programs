package com.vaibhav.samples.algoexpert;

import java.util.Scanner;

public class BinarySearch {


    public static void main(String args[]){
        int guessing_game[] = {1,3,5,7,9,12,13,14,15};
        Scanner keyboard = new Scanner(System.in);
        int target_value;
        System.out.print("Enter a guess: ");
        target_value = keyboard.nextInt();
        binarySearch(guessing_game,target_value);
    }

    public static void binarySearch(int[] guesses ,int target_value){

        int min = 0;
        int max = guesses.length-1;
        int position = (min+max)/2;

        while ((guesses[position] != target_value) && (min <= max)){
            if( guesses[position] > target_value){
                System.out.println("Target is greater then the guessed number");
                max = position - 1;
            }
            if( guesses[position] < target_value){
                System.out.println("Target is smaller then the guessed number");
                min = position + 1;
            }
            if( guesses[position] == target_value){
                System.out.println("Match Found");
            }
            position = (min+max)/2;
        }

        if (min <= max) {
            System.out.println("The number was found in array subscript " + position);
        }
        else
        {
            System.out.println("Sorry, the number is not in this array.");
        }
    }
}
