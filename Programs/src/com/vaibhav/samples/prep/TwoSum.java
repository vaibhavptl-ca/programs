package com.vaibhav.samples.prep;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6,7};
        int target = 4;

        add(arr,target);
    }

    public static int[] add(int[] arr, int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        int[] result = new int[2];
       for(int i = 0 ; i < arr.length; i++){
           if(map.containsKey(target-arr[i])){
               result[1] = i;
               result[0] = map.get(target-arr[i]);
               System.out.println(result);
               return result;
           }
           map.put(arr[i],i);
           System.out.println(result);
       }
       return result;
    }
}
