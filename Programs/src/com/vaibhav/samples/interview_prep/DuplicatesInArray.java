package com.vaibhav.samples.interview_prep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1,2,7};

        System.out.println(dupes(nums));

    }

    public static Set duplicates(int[] nums){

        Set set = new HashSet();

        for(int i = 0 ; i < nums.length; i++){
            if(!set.contains(i)){
                set.add(nums[i]);
            }
            else {
                set.add(-1);
            }
        }
        return set;
    }

    public static List dupes(int[] nums){

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i <nums.length; i++){
            int n = Math.abs(i);
            if(nums[n-1] < 0){
                list.add(nums[i]);
            }else
            {
                nums[n-1] = -1* nums[n-1];
            }
        }
        return list;
    }
}
