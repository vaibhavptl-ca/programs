package com.vaibhav.samples.prep;

public class BinarySearch {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(binarySearch(arr, 1, 11, 5));
    }

    public static int binarySearch(int arr[],int low,int high, int key) {
        int mid = (low + high) / 2;
        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            return -1;
        }
        return -1;
    }
}
