package interview_prep;

public class MinimumRotatedortedArray {

    public static void main(String[] args) {

        System.out.println(minimumElementInArray(new int[] {3,4,5,1,2}));

    }

    public static int minimumElementInArray(int[] nums){

        int left = 0;
        int right = nums.length - 1;

        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 2){
            return Math.min(nums[0], nums[1]);
        }

        if(nums[0] < nums[right]){
            return nums[0];
        }

        while (left<= right){

            int mid = left + (right - left)/ 2;

            //the array is decreasing at mid + 1

            if(nums[mid] > nums[mid+1]){
                return  nums[mid+1];
            }

            //the array is decreasing at mid
            if(nums[mid -1] > nums[mid]){
                return nums[mid];
            }

            //discard the sorted part >> increasing part

            if(nums[left] < nums[mid]){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
