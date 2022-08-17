package interview_prep;

public class BinaryRotatedArraySearch {

    public static void main(String[] args) {

        System.out.println(binaryRotatedArraySearch(new int[]{6, 7, 8, 9, 0, 1, 2, 3, 4, 5},4));
    }

    public static int binaryRotatedArraySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) return mid;

            if (nums[left] <= nums[mid]) { // left to right is sorted

                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else
                    left = mid + 1;
            }
            else {
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
