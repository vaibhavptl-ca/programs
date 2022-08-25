package interview_prep;

import java.util.HashMap;

public class DegreeOrFrequencyOfArray {


    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1};
                System.out.println(findDegreeOfArray(nums));
    }


    public static int findDegreeOfArray(int[] nums){

        HashMap<Integer,Integer> leftMap = new HashMap<>();
        HashMap<Integer,Integer> righttMap = new HashMap<>();
        HashMap<Integer,Integer> count = new HashMap<>();
        int ans = 0;
        int degree = 0;

        for(int i = 0 ; i < nums.length-1; i++){
            int current = nums[i];
            leftMap.putIfAbsent(current,i);
            righttMap.put(current,i);
            count.put(current,count.getOrDefault(current,0) + 1);
            degree = Math.max(count.get(current), degree);
             ans = nums.length;

            for(int x: count.keySet()){
                if(count.get(x) == degree){
                    ans = Math.min(ans,righttMap.get(x)-leftMap.get(x)+1);
                }
            }
        }
        return ans;
    }

}
