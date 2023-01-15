package com.vaibhav.samples.interview_prep;

import java.util.Arrays;

public class TargetSumOfPairs {

    public static void main(String[] args){
        int[] nums = {2,7,11,11,15};
        TargetSumOfPairs pair = new TargetSumOfPairs();
        int[] result = pair.twoSum(nums,18);
        System.out.println(Arrays.toString(result));
    }

    /**
     *
     * Input nums [2,7,11,15], target = 9
     * Output : [0,1]
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target){
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                sum = nums[i]+ nums[j];
                if(sum == target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No Solution Found");
    }


    public static String pairSum(int[] myArray, int sum) {
        String result = "";
        for(int i = 0 ; i< myArray.length; i++){
            for(int j=i+1; j < myArray.length; j++){
                if (myArray[i]+myArray[j]==sum) {
                    result += myArray[i]+":"+myArray[j]+" ";
                }
            }
        }
        return result;
    }
}
