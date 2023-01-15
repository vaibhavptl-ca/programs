package com.vaibhav.samples.interview_prep;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemovalString {

    public static void main(String[] args) {

        String str = "World is beautiful";

        char[] ch = str.toLowerCase().replaceAll("\\s", "").toCharArray(); // worldisbeautiful

        Set<Character> set = new LinkedHashSet<>();

        for (char c : ch) {
            set.add(c);
        }

        StringBuffer sb = new StringBuffer();
        for(char x: set){
            sb.append(x);
        }

        System.out.println(sb);
    }
}
