package interview_prep;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10,13,15,17};

        System.out.println(searchNumberInSortedArray(nums,7));
    }

    public static int searchNumberInSortedArray(int[] nums, int target){

        int left = 0, right = nums.length -1;

        while (left <= right){
            int mid = left + (right-left) / 2;
            if (target == nums[mid]) {
                return mid;
            }

            if(target >= nums[mid]){
                left =  mid + 1;
            }
            else{
                right = mid - 1;
            }

        }

        return -1;
    }
}
