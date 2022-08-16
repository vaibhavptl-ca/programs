package com.vaibhav.samples.spotify.HashTable;

public class Main {

    public static void main(String[] args){

        DirectChaining directChaining = new DirectChaining(10);
        directChaining.insertHashTable("Quick");
        directChaining.insertHashTable("World");
        directChaining.insertHashTable("Vaibhav");
        directChaining.insertHashTable("Fox");
        directChaining.insertHashTable("Will");
        directChaining.insertHashTable("Rock");
        directChaining.displayTable();

        directChaining.search("Vaibhav");
        directChaining.deleteKey("Fox");
        directChaining.displayTable();

    }
}
