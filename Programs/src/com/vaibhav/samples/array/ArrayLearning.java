package com.vaibhav.samples.array;
public class ArrayLearning {

    public static void main(String args[]){
        System.out.println("---------------------------------------------------------------------------------------");
        returnArrayInts(); // Simply Returns the array back
        System.out.println("---------------------------------------------------------------------------------------");
        returnEmployeeInformation(); // Calls a Class Constructor to fill up the array
        System.out.println("---------------------------------------------------------------------------------------");
        returnMultiDimensionalArrays();
        System.out.println("---------------------------------------------------------------------------------------");
        returnSumOfValuesByPassingArrayToMethod();
        System.out.println("---------------------------------------------------------------------------------------");
        cloningOfArray();
    }

    public static int[] returnArrayInts(){
        int valuesToBeReturned[];
        valuesToBeReturned = new int[10];
        valuesToBeReturned[0] = 21;
        valuesToBeReturned[1] = 30;
        valuesToBeReturned[2] = 15;
        valuesToBeReturned[3] = 17;
        valuesToBeReturned[4] = 29;
        valuesToBeReturned[5] = 11;
        valuesToBeReturned[6] = 43;
        valuesToBeReturned[7] = 55;
        valuesToBeReturned[8] = 27;
        valuesToBeReturned[9] = 10;

        //Iterate through Array where int i will be index and arr[i] will be the value which was held by index during runtime

        for(int i = 0; i<valuesToBeReturned.length; i++){
            System.out.println("Values which are being returned by array are as : "+ valuesToBeReturned[i] + " at Index " + i);
        }
            System.out.println("Total size of array is : " + valuesToBeReturned.length);

        return valuesToBeReturned;
    }

    public static EmployeeDTO[] returnEmployeeInformation(){

        EmployeeDTO[] employee = new EmployeeDTO[5];
        employee[0] = new EmployeeDTO("Raj",123,"510771212");
        employee[1] = new EmployeeDTO("Vaibhav",111,"510781212");
        employee[2] = new EmployeeDTO("Jay",321,"510771213");
        employee[3] = new EmployeeDTO("Kunal",441,"510775212");
        employee[4] = new EmployeeDTO("Saran",420,"510776212");

        for (EmployeeDTO employees : employee) {
            System.out.println("Employees are as : " + employees);
        }
        System.out.println("Total size of array is : " + employee.length);
        return employee;
    }

    public static int[][] returnMultiDimensionalArrays(){

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3;j++)
            System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        return arr;
    }

    private static int[] returnSumOfValuesByPassingArrayToMethod() {
        int[] arr = {2,3,4,6,8};
        sumOfArray(arr);
        return arr;
    }

    private static void sumOfArray(int[] arr) {
        int sum = 0;
        for(int i =0 ; i <arr.length; i++)
            sum += arr[i]; // Or you can do sum = sum + arr[i] as intial value of sum is 0 + value of arr[i]
        System.out.println("Sum Of Array is : "+ sum);
    }

    public static void cloningOfArray(){
        int intArray[] = {1,2,3};

        int[] clonedArray = new int[intArray.length];
        int i;
        for(i =0; i<intArray.length; i++) {
            clonedArray[i] = intArray[i];
        }

    }
}
