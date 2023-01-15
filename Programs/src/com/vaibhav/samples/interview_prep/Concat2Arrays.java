package com.vaibhav.samples.interview_prep;

public class Concat2Arrays {

    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];
        int len = nums.length;
        int i = 0;

        while(i < len)
        {
            ans[i] = nums[i];
            ans[i+len] = nums[i];
            i++;
        }
        return ans;
    }
}
