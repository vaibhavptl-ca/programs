package com.vaibhav.samples.prep;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

    public void shuffleArray(int[] arr){

        Random random = new Random();

        for(int i = 0 ; i< arr.length; i++){
            int arrayToBeSwapped = random.nextInt(arr.length);
            int temp = arr[arrayToBeSwapped];
            arr[arrayToBeSwapped] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
