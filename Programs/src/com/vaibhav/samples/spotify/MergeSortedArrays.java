package com.vaibhav.samples.spotify;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) throws UnknownHostException {

        String website = "www.thehashed.com";

        InetAddress ip = InetAddress.getByName(website);

        System.out.println(ip);

        int a[] = {1,2,3};
        int b[] ={2,4,6,8};
        mergeArray(a,b);
    }

    public static void  mergeArray(int[] a, int[] b){

        int sizeOfArrayA = a.length;
        int sizeOfArrayB = b.length;

        int[] c = new int[sizeOfArrayA+sizeOfArrayB];

        int i =0, j= 0, k= 0;

        while (i< sizeOfArrayA && j < sizeOfArrayB){

            if(a[i] <= b[j]){
                c[k] = a[i];

                i++;
                k++;
            }
            else {

                c[k] = b[j];

                j++;
                k++;
            }
        }

        while (i<sizeOfArrayA){
            c[k] = a[i];

            i++;
            k++;
        }

        while (j<sizeOfArrayB){
            c[k] = b[j];

            j++;
            k++;
        }

        System.out.print(Arrays.toString(c));
    }

}
