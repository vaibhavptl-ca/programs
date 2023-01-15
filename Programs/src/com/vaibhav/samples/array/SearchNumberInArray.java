package com.vaibhav.samples.array;

public class SearchNumberInArray {

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};
        SearchNumberInArray searchNumberInArray = new SearchNumberInArray();
        searchNumberInArray.searchInArray(array,6);
    }

    public void searchInArray(int[] intArray, int valueToSearch) {
        for(int i = 0; i < intArray.length; i++){
            if(intArray[0] == valueToSearch){
                System.out.println("Value is found at the first location index : "+i);
            }
            if(intArray[i] == valueToSearch){
                System.out.println("Value is found at the Index : "+i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }
}
