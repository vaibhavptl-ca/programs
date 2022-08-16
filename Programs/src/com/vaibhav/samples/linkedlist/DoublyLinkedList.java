package com.vaibhav.samples.linkedlist;

public class DoublyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public static void main(String[] args){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.createDoublyLinkedList(1);
        doublyLinkedList.insertIntoDoublyLinkedList(2,0);
        doublyLinkedList.insertIntoDoublyLinkedList(3,1);
        doublyLinkedList.insertIntoDoublyLinkedList(4,7);
        doublyLinkedList.traverseDLL();
        doublyLinkedList.reverseTraversal();
        doublyLinkedList.searchDLL(3);
        doublyLinkedList.searchDLL(4);
        doublyLinkedList.searchDLL(2);
        doublyLinkedList.deleteDLL(0);
        doublyLinkedList.traverseDLL();
        doublyLinkedList.deleteEntireDLL();
        doublyLinkedList.traverseDLL();
    }

    /**
     *
     * Time Complexity = O(1) and Space Complexity = O(1)
     *
     * @param nodeValue
     * @return
     */
    public Node createDoublyLinkedList(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        node.previous = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    /**
     *  Time : O(N)
     *  Space : O(1)
     * @param nodeValue
     * @param location
     */
    public void insertIntoDoublyLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if(head == null){
            createDoublyLinkedList(nodeValue);
            return;
        }
        else if(location == 0){
            node.next = head;
            node.previous = null;
            head.previous = node;
            head = node;
        }
        else if(location >= size){
            node.next = null;
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        else {
            Node tempNode = head;
            int index = 0;
            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            node.previous = tempNode; // backward link
            node.next = tempNode.next;
            tempNode.next = node;
            node.next.previous = node;
        }
        size++;
    }


    /**
     *  Time : O(N)
     *  Space : O(1)
     */
    public void traverseDLL(){
        if(head!= null){
            Node tempNode = head;
            for(int i = 0 ; i< size; i++){
                System.out.print(tempNode.value);
                if(i != size-1)
                {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }else {
            System.out.println("\n No DLL exist");
        }
        System.out.print("\n");
    }

    /**
     *  Time : O(N)
     *  Space : O(1)
     */
    public void reverseTraversal(){
        if(head != null){
            Node tempNode = tail;
            for (int i = 0 ; i < size; i++){
                System.out.print(tempNode.value);
                if(i != size-1)
                {
                    System.out.print("->");
                }
                tempNode = tempNode.previous;
            }
        }
        else {
            System.out.println("\n No DLL exist");
        }
        System.out.print("\n");
    }

    public boolean searchDLL(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if(tempNode.value == nodeValue){
                    System.out.println("Node found at location : "+ i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("No DLL Exists");
        return false;
    }

    /**
     * Time : O(N)
     * Space : O(1)
     *
     * @param location
     */
    public void deleteDLL(int location){
        if(head == null){
            System.out.println(" No DLL exist to delete a node");
            return;
        }
        else if (location == 0){
            if(size == 1){
                head = null;
                tail = null;
                size--;
                return;
            }else {
                head = head.next;
                head.previous = null;
                size--;
            }
        }
        else if (location >= size){
           Node tempNode = tail.previous;
            if(size == 1){
                head = null;
                tail = null;
                size--;
                return;
            }else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        } else {
            Node tempNode = head;
            for(int i = 0; i <location -1; i++){
                tempNode = tempNode.next;
            }

            tempNode.next = tail.next;
            tail.previous = tempNode;
            size--;
        }
    }

    /**
     * Time : O(N)
     * Space : O(1)
     */
    public void deleteEntireDLL(){

        Node tempNode = head;

        for(int i = 0; i<size ; i++){
            tempNode.previous = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.print("The DLL has been deleted");

    }
}
