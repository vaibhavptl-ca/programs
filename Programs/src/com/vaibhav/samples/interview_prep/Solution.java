package interview_prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        String[] logs = {"Hello", "Hello2","Hello3", "Hello4", "Hello5", "Hello"};

        recentItems(Arrays.asList(logs));
    }

    public static List<String> recentItems(List<String> logs) {

        List<String> viewedList = new ArrayList<>();
        int countTimes = 0, pos = 0;
        String visitedItems ;
        List<String> temp = new ArrayList<>();

            for (int i = 0; i < logs.size(); i++) {
                if (!viewedList.contains(logs.get(i))) {
                    visitedItems = viewedList.get(i);
                    System.out.println("Already Visited " + visitedItems);
                    temp.add(visitedItems);
                    viewedList.add(visitedItems);
                }

                viewedList.addAll(temp);
            }
            System.out.println("Viewed Items : "+viewedList);
        return viewedList;
    }

}
