package com.vaibhav.samples.interview_prep;

public class MissingNumber {

    public static void main(String[] args) {
        int intArray[] = {1,2,3,4,5,6,8,9,10};
        MissingNumber missingNumber = new MissingNumber();
        missingNumber.missingNumber(intArray);
    }

    public void missingNumber(int[] intArray){
        int sumForFindingArrayValue = 0;

        for(int i = 0; i < intArray.length; i++){
            sumForFindingArrayValue += intArray[i];
        }

        int sumForAllTheValues = 10 * (10+1) / 2;

        int difference = sumForAllTheValues - sumForFindingArrayValue;
        System.out.println("Missing value is : "+ difference);

    }

    static int missingNumber(int[] arr, int totalCount) {
        int actualSumValue = 0;
        int expectedSumValue = 0;

        for(int i = 0; i < arr.length; i++){
            actualSumValue += arr[i];
        }

        for (int j = 0; j<=totalCount; j++){
            expectedSumValue += j;
        }

        return expectedSumValue - actualSumValue;
    }
}
