package com.vaibhav.samples.spotify;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * We're given an array of continuous numbers that should increment sequentially by 1, which just means that we expect a sequence like:
 * [1, 2, 3, 4, 5, 6, 7]
 *
 * However, we notice that there are some missing numbers in the sequence.
 * [1, 2, 4, 5, 7]
 */
public class MissingSequentialNumber {


    public static void main(String[] args){
        int arr[] = {1,2,3,5,8,11};

        System.out.println(Arrays.deepToString(new List[]{findMissingNumber(arr)}));

    }

    public static List<Integer> findMissingNumber(int[] numArray){

        List<Integer> missing = new ArrayList<>();

        for(int i = 1; i < numArray.length; i++){

            if(numArray[i] - numArray[i-1] != 1){
                int x = numArray[i] - numArray[i-1];
                int diff = 1;

                while (diff < x){
                    missing.add(numArray[i-1] + diff);
                    diff++;
                }
            }
        }
        return missing;
    }
}
