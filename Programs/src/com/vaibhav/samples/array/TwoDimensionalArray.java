package com.vaibhav.samples.array;

import java.util.Arrays;

public class TwoDimensionalArray {
    static int[][] arr = null;

    public TwoDimensionalArray(int numRows, int numCols){
        this.arr = new int[numRows][numCols];
        for (int row = 0; row < arr.length; row++) {
            for (int cols = 0; cols < arr[0].length; cols++) {
                arr[row][cols] = Integer.MIN_VALUE;
            }
        }
    }

    public static void main(String args[]) {
        //step 1 : declare array
//        int[][] int2DArray;
//
//        //step 2 : Instantiate array
//        int2DArray = new int[2][2];
//
//        // step 3 : Initialize
//
//        int2DArray[0][0] = 1;
//        int2DArray[0][1] = 2;
//        int2DArray[1][0] = 3;
//        int2DArray[1][1] = 4;
//
//        System.out.println(Arrays.deepToString(int2DArray));


        // All together of creating 2D arrays
        String s2DArray[][] = {{"hello","world"}, {"hello", "champ"}};

        System.out.println(Arrays.deepToString(s2DArray));
 // Time complexity will be O(mn) as m = rows and n = columns

        TwoDimensionalArray tdArray = new TwoDimensionalArray(4,4);
        tdArray.insertIn2DArray(0,0,10);
        tdArray.insertIn2DArray(0,1,11);
        tdArray.insertIn2DArray(0,2,12);
        tdArray.insertIn2DArray(0,3,13);
        tdArray.insertIn2DArray(1,0,21);
        tdArray.insertIn2DArray(1,1,22);
        tdArray.insertIn2DArray(1,2,23);
        tdArray.insertIn2DArray(1,3,24);
        System.out.println(Arrays.deepToString(arr));

        traverse2DArray();
        searchArray(12);

    }

    public static void insertIn2DArray(int row, int column, int valueToBeInserted){
        if(arr[row][column] == Integer.MIN_VALUE) {
           arr[row][column] = valueToBeInserted;
           System.out.println("The value is successfully inserted");
        }
        else {
            System.out.println("Array Index is occupied");
        }
    }

    public static void traverse2DArray(){

        for(int i = 0 ; i < arr.length ; i++){  // O(m)
            for(int j = 0; j < arr[0].length; j++){ // O(n)
                System.out.print(arr[i][j] + " "); // O(1)
            }
            System.out.println(); // O(1)
        }

        // Time Complexity  == O(MN)
        // Space Complexity == O(1)
    }

    public static void searchArray(int valueToBeSearched){

        for(int i = 0 ; i <arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == valueToBeSearched) {
                    System.out.println("Value is found at index : [" + i + " " + j +"]");
                    return;
                } else {
                    System.out.println("Value not found");
                }
            }
        }
    }

    public static void deleteArray(int row, int col){
        try {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("Value is deleted successfully");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Value provided is not in range of array");
        }
    }
}
