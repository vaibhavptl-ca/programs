package com.vaibhav.samples.interview_prep;

public class LongestPalinString {

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        System.out.println("Length is: "
                + longestPalindrome(str));
    }

    public static int longestPalindrome(String str){

        int n = str.length();
        if(n < 2) return n;

        int max = 1, start = 0;
        int low, high;

        for(int i = 0; i < n; i++) {
            low = i - 1;
            high = i + 1;

            while (high < n && str.charAt(high) == str.charAt(i))
                high++;

            while (low >= 0 && str.charAt(low) == str.charAt(i))
                low--;

            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }

            int length = high - low - 1;
            if(max < length){
                max = length;
                start = low+1;
            }
        }
        return max;
    }

}
