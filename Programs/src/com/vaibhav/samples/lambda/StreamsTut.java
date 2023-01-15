package com.vaibhav.samples.lambda;

import java.util.*;
import java.util.stream.*;

public class StreamsTut {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(new Integer(1));
        l.add(new Integer(2));
        l.add(new Integer(3));
        l.add(new Integer(10));
        l.add(new Integer(8));
        l.add(new Integer(2));
        l.add(new Integer(7));
        l.add(new Integer(9));
        l.add(new Integer(1));
        System.out.println(l);

        ArrayList<Integer> list = new ArrayList<>();

        for (Integer i : l) {
            if (i >= 3) {
                list.add(i);
            }
        }
        System.out.println(list);

        // Filter
        List<Integer> ll = l.stream().filter(i -> i >= 3).collect(Collectors.toList());
        System.out.println(ll);

        // Map
        List<Integer> l2 = l.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(l2);

        //Count
        long cnt = l.stream().filter(i -> i >= 3).count();
        System.out.println(cnt);

        // Sorting
        // Default Natural sorting : sorted()
        List<Integer> l3 = l.stream().sorted().collect(Collectors.toList());
        System.out.println(l3);

        //Custom Sorting : sorted(Comparator c)

        List<Integer> l4 = l.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(l4);

    }
}
