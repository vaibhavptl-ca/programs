package com.vaibhav.samples.spotify.HashTable;

import java.util.ArrayList;

public class LinearProbing {

    String[] hashTable;
    int usedCellNumber;

    LinearProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCIIFunction(String word, int numOfCells) {
        char[] ch = word.toCharArray();

        int i, sum;

        for (sum = 0, i = 0; i < word.length(); i++) {
            sum += ch[i];
        }
        return sum % numOfCells;
    }


    public double getLoadFactor() {
        double loadFactor = usedCellNumber * 1.0 / hashTable.length;
        return loadFactor;
    }

    public void rehashKeys(String word) {

        ArrayList<String> data = new ArrayList<String>();

        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
            data.add(word);
            hashTable = new String[hashTable.length * 2];

//            for(String s : data){
//
//            }
        }
    }

    public void insertHashTable(String word){
        double loadFactor = getLoadFactor();
        if(loadFactor >= 0.5){
            rehashKeys(word);
        }else {
            int index = modASCIIFunction(word,hashTable.length);

            for(int i = index; i < index+hashTable.length; i++){

                int newIndex = i % index+hashTable.length;
                if(hashTable[newIndex] == null){
                    hashTable[newIndex] = word;
                    System.out.println("Word : "+word + " successfully inserted at location : "+ newIndex);
                    break;
                }
            }
        }
        usedCellNumber++;
    }
}
