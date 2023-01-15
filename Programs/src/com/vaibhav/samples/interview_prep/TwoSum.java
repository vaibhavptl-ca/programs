package com.vaibhav.samples.interview_prep;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(new int[][]{twoSum(new int[]{2, 7, 11, 15}, 9)}));

    }

    public static int[] twoSum(int[] nums, int target){

        int[] ans  = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int difference = target  - nums[i];
            if(map.containsKey(difference)){
                ans[0] = i;
                ans[1] = map.get(difference);
                break;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
