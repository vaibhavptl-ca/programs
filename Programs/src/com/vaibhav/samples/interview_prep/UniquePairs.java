package interview_prep;

import java.util.HashMap;
import java.util.Map;

public class UniquePairs {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(uniquePair(nums, 2));
    }

    private static int uniquePairs(int[] nums, int diff) {
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == diff || nums[i] - nums[j] == diff) {
                    result++;
                }
            }
        }
        return result;
    }

    private static int uniquePair(int[] nums, int diff) {
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            if (entry.getValue() >= 2) {
                count += 1;
            } else if (map.containsKey(entry.getKey() + diff)) {
                count += 1;
            }
        return count;
    }
}
