package com.vaibhav.samples.spotify.HashTable;

import java.util.LinkedList;

public class DirectChaining {

    LinkedList<String>[] hashtable;
    int maxChainSize = 5;


    DirectChaining(int size){
        hashtable = new LinkedList[size];
    }

    public int modASCIIFunction(String word, int numOfCells){
        char[] ch = word.toCharArray();

        int i, sum;

        for(sum = 0 ,i=0; i< word.length();i++){
            sum+= ch[i];
        }
        return sum % numOfCells;
    }

    public void insertHashTable(String word){
        int newIndex = modASCIIFunction(word, hashtable.length);

        if(hashtable[newIndex] == null){
            hashtable[newIndex] = new LinkedList<String>();
            hashtable[newIndex].add(word);
        }
        else{
            hashtable[newIndex].add(word);
        }
    }

    public boolean search(String word){
        int newIndex = modASCIIFunction(word, hashtable.length);

        if(hashtable[newIndex] != null && hashtable[newIndex].contains(word)){
            System.out.println("Word "+ word + " found at Index "+ newIndex);
            return true;
        }
        return false;
    }

    public void deleteKey(String word){
        int newIndex = modASCIIFunction(word, hashtable.length);

        boolean searchedValue = search(word);
        if(searchedValue == Boolean.TRUE){
            hashtable[newIndex].remove(word);

            System.out.println("Word "+ word + " has been deleted from the hashtable");
        }

    }

    public void displayTable(){

        if(hashtable == null){
            System.out.println("Table does not exist");
            return;
        } else {
          System.out.println(" \n --------- HashTable ----------");

          for(int i = 0 ; i < hashtable.length; i++){
              System.out.println("Index "+i + ", key "+ hashtable[i]);
          }
        }

    }
}
