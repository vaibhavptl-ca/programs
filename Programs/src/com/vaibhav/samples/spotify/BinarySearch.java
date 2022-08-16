package com.vaibhav.samples.spotify;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args){

        int[] arr = {1,2,4,6,7,9,12,16,21,34};

        Scanner sc = new Scanner(System.in);
        int numToSearch = sc.nextInt();

        search(arr,numToSearch);
        sc.close();
    }

    public static void search(int arr[], int numToSearch){

        int low = 0;
        int high = arr.length - 1;

        int mid = 0;

        while (low <= high){
            mid = (low +high)/2;

            if(numToSearch == arr[mid]){
                System.out.println("Found the number at : "+ mid);
                break;
            }
            else if(numToSearch < arr[mid]) {
                high = mid - 1;
            }
            else if(numToSearch > arr[mid]){
                low = mid + 1;
            }
        }

        if(low > high){
            System.out.println("given number is not present");
        }
    }
}
