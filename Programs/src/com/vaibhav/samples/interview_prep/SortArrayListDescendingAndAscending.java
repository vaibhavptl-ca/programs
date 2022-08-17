package interview_prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayListDescendingAndAscending {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList();
        list.add(9);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(4);

        Collections.sort(list);
        System.out.println("Ascending order : "+list.toString());

        Collections.sort(list,Collections.reverseOrder());

        System.out.println("Descending oder : "+ list.toString());

    }

}
