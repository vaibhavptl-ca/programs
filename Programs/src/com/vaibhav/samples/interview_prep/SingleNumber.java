package com.vaibhav.samples.interview_prep;

import java.util.HashSet;

public class SingleNumber {

    public static void main(String[] args){

        int[] nums = {4,1,2,1,2};
        singleNumber(nums);
    }

    // Brute Force Method
    public static int singleNumber(int[] nums){

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < nums.length;i++){

            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else {
                set.remove(nums[i]);
            }
        }
        return set.iterator().next();
    }

    // EXOR comparator (O(N) time and O(1) space)

    public static int singleNumberEff(int[] nums) {

        int ans = nums[0];

        for(int i = 1 ; i < nums.length;i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
