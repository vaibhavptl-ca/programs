package com.vaibhav.samples.array;

import java.util.Arrays;

public class RotateArrayTo90Degrees {


    public static void main(String args[]){
        int[][] arrayMatrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        RotateArrayTo90Degrees rotateArrayTo90Degrees = new RotateArrayTo90Degrees();
        rotateArrayTo90Degrees.rotateMatrix(arrayMatrix);

        System.out.println(Arrays.deepToString(arrayMatrix));
    }

    public boolean rotateMatrix(int[][] matrix) {
    if(matrix.length == 0 || matrix.length != matrix[0].length){ // matrix.length is returning number of columns
        return false;
    }
    int n = matrix.length;

    for(int layer = 0 ; layer < n/2 ; layer++){ //to check no of layers it will be arrayLength by 2

        int first = layer; // Layers we can consider as 2 outer layer first = ( 1,3,7,9) and second = (2,4,6,8)
        int last = n-1-layer;

        for(int i = first; i < last; i++) { // this will be used to rotate over i or total number of cells
            int offsetLocation = i - first; // location of the cell
            int top = matrix[first][i]; // temp variable where top/first cell of the array will be stored
            matrix[first][i] = matrix[last - offsetLocation][first]; //  left cell of row 3 and column 1 will be accessed by [last-offset][first]
            matrix[last - offsetLocation][first] = matrix[last][last - offsetLocation];  //  bottom cell of row 3 and column 3 will be accessed by [last][last-offset]
            matrix[last][last - offsetLocation] = matrix[i][last]; // right i will be accessed as row 1 and column 3 so that will be [i][last]
            matrix[i][last] = top;
        }
    }
    return true;
    }
}
