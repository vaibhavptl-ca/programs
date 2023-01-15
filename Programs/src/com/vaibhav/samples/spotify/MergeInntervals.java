package com.vaibhav.samples.spotify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeInntervals {


    public static void main(String[] args){
        List<List<Integer>> lists = mergeIntervals(new int[][]{{1, 4}, {2, 5}, {7, 10}, {12, 16}});

        for(List i : lists){

            List<List<Integer>> collect = lists.stream().parallel().collect(Collectors.toList());

            System.out.println(collect);

        }


    }

    public static List<List<Integer>> mergeIntervals(int[][] ranges) {

        Arrays.sort(ranges, (int[] a, int[] b) -> {
            final int l = a[0] - b[0];
            final int r = a[1] - b[1];
            return l > 0 ? l : (r > 0 ? r : l);
        });

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> last = null;

        for (int[] r : ranges) {
            if (last == null || r[0] > last.get(1)) {
                last = Arrays.stream(r).boxed().collect(Collectors.toList());
                result.add(last);
            } else if (r[1] > last.get(1)) {
                last.set(1, r[1]);
            }
        }

        return result;
    }
}
