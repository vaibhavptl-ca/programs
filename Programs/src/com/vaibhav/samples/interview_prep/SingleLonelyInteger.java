package interview_prep;

import java.util.HashMap;

public class SingleLonelyInteger {

    public static void main(String[] args){
    int[] arr = {1,2,4,1,2};

    System.out.println(singleInteger(arr));
    }

    public static int singleInteger(int[] num){
        int result = 0;
        for(int i : num){
            result ^= i;
        }
        return result;
    }


    public static int intByMap(int[] nums){
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int num : nums)
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);

        for (int k : hashmap.keySet())
            if (hashmap.get(k) == 1) return k;
        return -1;
    }
}
