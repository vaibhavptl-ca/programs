package com.vaibhav.samples.interview_prep;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   The World is    not that   great  "));
    }

    public static int lengthOfLastWord(String s) {
        int right = s.length() - 1;

        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }

        int left = right;
        while (left >= 0 && s.charAt(left) != ' ')
        {
            left--;
        }
        return right - left;
    }

}
