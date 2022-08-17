package interview_prep;

import java.util.Scanner;
import java.util.TreeMap;

public class GroupTotals {

    public static String GroupTotals(String[] strArr) {
        TreeMap<String, Integer> map = new TreeMap<>();

        for(String s : strArr){
            String[] str = s.split(":");
            String key = str[0];
            map.put(key, map.getOrDefault(key,0)+ Integer.valueOf(str[1]));
            if(map.get(key) == 0){
                map.remove(key);
            }

        }
        return map.toString().replaceAll("[{}]", "").replaceAll("=",":");
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print(GroupTotals(s.nextLine()));
    }
}
