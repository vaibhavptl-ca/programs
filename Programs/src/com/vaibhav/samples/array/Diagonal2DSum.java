package com.vaibhav.samples.array;

import java.util.Arrays;

/***
 *
 * Given a 2D Array calculate the sum of diagonal elements
 *
 * Example = {{1,2,3},{4,5,6},{7,8,9}}
 *
 */
public class Diagonal2DSum {

    public static void main(String[] args){
        int[][] array = {{1,5,4},{4,5,6},{7,8,9}};
        int sum = firstSum(array);

        System.out.println("Total sum of the Diagonal Array"+ Arrays.deepToString(array)+" is : " +sum );
    }

    public static int sumDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0 ; i< a.length; i++){
            sum += a[i][i];
        }
        return sum;
    }

    public static int firstSum(int[][] a){
        int sum = 0;
        for(int i=0; i< a.length; i++){
            sum += a[i][0];

        }
        return sum;
    }

    public static int middleSum(int[][] a){
        int sum = 0;
        int j = 1;
        for(int i=0; i< a.length; i++){
                sum += a[i][j];

        }
        return sum;
    }

    public static int lastSum(int[][] a){
        int sum = 0;
        for(int i=0; i< a.length; i++){
            sum += a[i][2];
        }
        return sum;
    }
}
