package interview_prep;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {35,1,5,16,3,9,12};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr){

        for(int i = 0; i< arr.length; i++){
            int k = i;
            for(int j = i+1; j< arr.length-1; j++){
                if(arr[j] < arr[k]){
                    k = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
