package com.vaibhav.samples.interview_prep;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {

        int[] nums = {2,0,1,0,2,2,1,0,1};
        System.out.println(Arrays.deepToString(new int[][]{sortColors(nums)}));
    }

    public static int[] sortColors(int[] nums){

        int left = 0, mid = 0, right = nums.length-1;

        while (mid <= right){
            if(nums[mid] == 0){
                swap(left,mid,nums);
                left++;
                mid++;
            }else if( nums[mid] == 1){
                mid++;
            }else {
                swap(mid,right,nums);
                right--;
            }
        }
        return nums;
    }

    public static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
