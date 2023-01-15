package com.vaibhav.samples.interview_prep;

public class FirstMissingPositive {

    public static void main(String[] args) {

        int[] nums = {1,2,4,5};

        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums){
        int length = nums.length;

        if(length == 0) return 1;

        for(int i = 0; i<length; i++){
            if(nums[i] > length || nums[i] <=0){
                i++;
            }
            else if(nums[nums[i]-1] == nums[i]){
                i++;
            }
            else {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }

        for(int i = 0 ; i < length; i++){
            if(nums[i] != i +1){
                return i+1;
            }
        }
        return nums[length -1]+1;
    }

}
