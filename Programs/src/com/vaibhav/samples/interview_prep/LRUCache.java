package com.vaibhav.samples.interview_prep;



import java.util.HashMap;

// two components Hashmap - Get Operations in O(1) and Doubly Linked List -- Deletions O(1)
public class LRUCache {

    Node head;
    Node tail;

    int capacity;
    HashMap<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key){
        if(map.get(key) == null){
            return -1;
        }

        Node t = map.get(key);
        removeNode(t); // remove node from current location
        addNodeToTail(t);


        return  t.value;
    }

    public void put(int key, int value){

        if(map.containsKey(key)){
            Node t = map.get(key);
            t.value = value;

            removeNode(t);
            addNodeToTail(t);
        }
        else {
            if(map.size() >= capacity){
                //delete the element at head
                map.remove(head.key);
                removeNode(head);
            }

            Node newNode = new Node(key,value);
            addNodeToTail(newNode);
            map.put(key, newNode);
        }

    }


    public void removeNode(Node node){

        if(node.prev != null){
            node.prev.next = node.next;
        }
        else{
            head = node.next;
        }

        if(node.next != null){
            node.next.prev = node.prev;
        }
        else {
            tail = node.prev;
        }
    }


 // add most recently used elements to tail
    public void addNodeToTail(Node node){

        if(tail != null){
            tail.next = node;
        }

        node.prev = tail;
        node.next = null;
        tail = node;


        if(head == null){
            head = tail;
        }

    }


    public void displayCache(){

        Node n = head;
        while (n != null){
            System.out.println(n.toString());
        }
    }


    public static void main(String[] args){

        int capacity = 3;

        LRUCache cache = new LRUCache(capacity);

        cache.put(1,3);
        cache.put(2,5);
        cache.put(3,7);

        cache.displayCache();

    }
}




class Node {
    Node next;
    Node prev;
    int key;
    int value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key : " + key + " , " + "Value : " + value;
    }
}