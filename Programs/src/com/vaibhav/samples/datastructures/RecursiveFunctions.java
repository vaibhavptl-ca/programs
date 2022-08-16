package com.vaibhav.samples.datastructures;

import java.util.Arrays;

public class RecursiveFunctions {


    public static void main(String args[]){


//        openRussianDoll(10);
//        RecursiveFunctions recValues = new RecursiveFunctions();
//        int number = recValues.factorialCalculator(4);
//        System.out.println("Factorial value is : "+number);
//
//        int fibResult = recValues.fibonacciSeries(9);
//        System.out.println("The Value at Fibonacci position 9 is : "+fibResult);
//
//        int sumOfDigits = recValues.sumOfDigits(1134);
//        System.out.println("The Sum of digits is : "+sumOfDigits);
//
//        int exponential = recValues.powerCalc(2,4);
//        System.out.println("The Exponential value is : "+exponential);
//
//        int gcd = recValues.gcd(8,12);
//        System.out.println("Greatest Common Divisor is : "+ gcd);
//
//        int binaryConversion  = recValues.binary(13);
//        System.out.println("Binary Value is : " + binaryConversion);
//
//        int productOfArray = recValues.productofArray(new int[]{1, 2, 3, 4, 5},5);
//        System.out.println("Product of all the values in Array : " + productOfArray);
//
//        int recursiveRange = recValues.recursiveRange(10);
//        System.out.println("Sums all values less then the number passed : "+ recursiveRange);
//
//        String reverseByRecursive = recValues.reverse("appmillers");
//        System.out.println("Reversed string is : "+reverseByRecursive);
//
//        String reverseString = recValues.reverseString("appmillers");
//        System.out.println("Reversed string is : "+reverseString);
//
        int[] array = {1,2,3,4,5,6};
//        reverseArray(array);
//        sumAndProductOfArray(array);

        printPairs(array);

    }

    static void printPairs(int[] array){
        for(int i =0; i<array.length;i++){  // O(N)
            for(int j = 0; j<array.length; j++){  // O(N) i.e. O(N^2)
             System.out.println("[ " +array[i] + ", " + array[j] + " ]");// O(1)
            }
        }
    }

    static void printUnorderedPairs(int[] array){
        for(int i =0; i<array.length;i++){  // O(N)
            for(int j = i+1; j<array.length; j++){  // O(N) i.e. O(N^2)
                System.out.println("[ " +array[i] + ", " + array[j] + " ]");// O(1)
            }
        }

        /**
         *  1st iteration -- n-1 as it runs till length of inner loop
         *  2nd -- n-2
         *
         *  (n-1) + (n-2) + (n-3) .... +2 +1
         *  =1+2+ .... (n-3)+(n-2)+(n-1)
         *  =n(n-1)/2
         *  =n^2/2 - n/2
         *  =n^2
         *  Time complexity will be O(N^2)
         *
         *
         *  --Average Work
         *
         *  For Example if Outer loop runs N times
         *  then Inner loop?
         *
         *  assume inner loop runs for 10 iterations
         *  1st -- 10
         *  2nd -- 9
         *  3rd -- 8
         *  Nth -- 1
         *  Average out 10/2 = 5 Times
         *  n/2 will be the output for inner loop
         *  for each outer loop it will run for n * n/2
         *  n^2/2
         *  and as 1/2 is non dominant constant we will have time complexity as O(N^2)
         *
         */

    }

    static void reverseArray(int[] array){
        for(int i = 0; i < array.length/2; i++){  // O(N/2) as the iteration is half the size of array
            int arrayValues = array.length-i-1; //as the initial value of i will be 0 and that will take it as 6-0-1 = 5th Index element
            int temp = array[i]; // assignment will have O(1)
            array[i] = array[arrayValues];  // assignment will have O(1)
            array[arrayValues] = temp;  // assignment will have O(1)
        }
        System.out.println(Arrays.toString(array));  // assignment will have O(1)
        // Time Complexity will be O(N) as all non-dominant will be removed
    }

    static void openRussianDoll(int doll){
        if(doll == 1){
            System.out.println("All dolls are opened");
        }else
        {
            openRussianDoll(doll-1);
        }
    }

    // factorial value calculations
     int factorialCalculator(int factorialNumber){                         //  M(n)
        if(factorialNumber < 0){                                           //  O(1)
            return -1;
        }
        if(factorialNumber == 0 || factorialNumber == 1){
            return 1;                                                      // O(1)
         }
            return factorialNumber * factorialCalculator(factorialNumber-1); // M(n-1)

         // M(n) = O(1) + M(n-1)
         // O(N) will be time complexity

    }


    //fibonacci series (0, 1, 0+1=1, 1+1=2, 1+2=3, 3+2 = 5, 5+3 = 8, 8+5=13, 13+8 = 21  .... and so on
    int fibonacciSeries(int fibValue){
        if(fibValue<0){
            return -1;
        }
        if(fibValue == 0 || fibValue == 1){
            return fibValue;
        }
        return fibonacciSeries(fibValue-1) + fibonacciSeries(fibValue-2); // O(2^n) time complexity
    }

    //sum of digits using recursion for example 112 -> 112/10 = 11 and remainder = 2 so divide again 11/10 = 1 and remainder = 1
    int sumOfDigits(int n){
        if(n<=0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }

    // Calculate the power of the integer : 2 to the power of 4 where base is 2 and exp = 4
    int powerCalc(int base,int exp){
        if(exp < 0){
            return -1;
        }

        if(exp==0){
            return 1;
        }
        return base*powerCalc(base,exp-1);
    }


    // GCD -- Greatest Common Divisor for exmaple (8,12) => 8 = 2 * 2 * 2 , 12 = 2 * 2 * 3; the common is 2 * 2 =4( which is GCD here)

    int gcd(int a, int b){
        if(a < 0 || b < 0){
            return -1;
        }
        if(b == 0){ // as we calculate and divide the numbers by b for getting the remainder
            return a;
        }
        return gcd(b,a % b);
    }

    // convert int to binary

    int binary(int n){
        if(n < 0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        return n%2 + 10 * binary(n/2);
    }

    //product of array
    public int productofArray(int A[], int N)
    {
        if(N <= 0){
            return 1;
        }
        return (productofArray(A,N-1) * A[N-1]);
    }

    static void sumAndProductOfArray(int[] array){
        int sum = 0;
        int product = 1;

        for(int i = 0 ; i< array.length; i++){
            sum += array[i];
        }

        for(int j = 0; j< array.length; j++){
            product *= array[j];
        }

        System.out.println(sum + "," + product);
    }

    // recursive range
    public int recursiveRange(int num) {
        if(num <= 0){
            return 0;
        }
        return num + recursiveRange(num-1);
    }

    //reverse a string
    public String reverse(String str)
    {
        if(str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public String reverseString(String str){

        char ch;
        String newStr = "";

        for(int i = 0 ; i <str.length(); i++){
        ch = str.charAt(i);
        newStr = ch + newStr;
        }
        return newStr;
    }

    // palindrome
    public  boolean isPalindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));
        return false;

    }

    public boolean isPalindrome(int x) {
        if(x < 0 || (x%10 == 0 && x!=0)){
            return false;
        }

        int revertedNum = 0;
        while( x > revertedNum){
            revertedNum = revertedNum * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNum || x == revertedNum/10;
    }
}

