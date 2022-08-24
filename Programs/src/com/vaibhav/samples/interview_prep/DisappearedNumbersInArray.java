package interview_prep;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbersInArray {

    public static void main(String[] args) {

        int[] nums = {1,2,2,4,1};

        System.out.println(disappearedNumber(nums));

    }

    public static List<Integer> disappearedNumber(int[] nums){

        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < nums.length-1; i++){
            int n = Math.abs(nums[i]);
            if(nums[n-1] > 0){
                nums[n-1] = -1 * nums[n-1];
            }
        }

        for(int i = 0; i< nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
    return list;
    }
}
