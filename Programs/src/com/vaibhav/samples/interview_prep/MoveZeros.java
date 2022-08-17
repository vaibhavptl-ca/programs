package interview_prep;


import java.util.LinkedList;
import java.util.Queue;

import static java.util.Arrays.*;

public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 3, 5, 0, 6, 0, 4};
        System.out.println(deepToString(new int[][]{moveZeros(nums)}));
    }

    public static int[] moveArray(int[] nums) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                queue.add(nums[i]);
            }
        }
        int index = 0;

        while (queue.size() != 0) {
            nums[index] = queue.poll();
            index++;
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }

        return nums;
    }

    public static int[] moveZeros(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }

        for(int i = left; i < nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }

}
