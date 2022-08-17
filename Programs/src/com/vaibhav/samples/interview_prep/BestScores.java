package interview_prep;

import java.util.Arrays;
import java.util.Collections;


/**
 *  Give an array, write a functionn to get first, second best scores from the array.
 *  Array may contain duplicates.
 *
 *  Example :
 *  myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
 *
 */
public class BestScores {

    public static void main(String[] args){
        Integer[] array = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        firstSecond(array);
    }

    static String firstSecond(Integer[] myArray) {
        Integer[] arr = myArray;
//        Arrays.sort(arr, Collections.reverseOrder());
        int temp = 0;
        for (int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.deepToString(arr));
        }

        int first = arr[0];
        Integer second = null;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != first) {
                second = arr[i];
                break;
            }
        }
        return first+" "+second;
    }
}
