package com.vaibhav.samples.linkedlist;

class Node {
    public int value; // passed by a param value to be placed at node
    public Node next; // this holds the reference to next Node address
    public Node previous;
}


public class SinglyLinkedList {

    public Node head; // Head of the Node
    public Node tail; // Tail of the Node
    public int size;

    /**
     * Time and Space Complexity - O(1)
     * @param nodeValue
     * @return
     */
    public Node createSinglyLinkedLList(int nodeValue) {
        Node node = new Node(); // Instantiating a Node
        node.value = nodeValue; // value will be assigned as the Node value
        node.next = null; // nextReference to node assigned as Null
        head = node; // node will be assigned to head
        tail = node; // node will be assigned to tail
        size = 1; // size of Node
        return head; // Time and Space Complexity = O(1)
    }


    /**
     *  Time complexity : O(N) and
     *  Space : O(1) -- As it always inserts at one position at a time
     */
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if(head == null){
            createSinglyLinkedLList(nodeValue);
            return;
        }
        else if(location == 0){
            node.next = head;
            head = node;
        }
        else if (location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else {
            Node temp = head;
            int index = 0;
            while (index < location - 1){
                temp = temp.next;
                index++;
            }
            Node nextNode = temp.next;
            temp.next = node;
            node.next = nextNode;
        }
        size++;
    }


    /**
     *  Time complexity : O(N)
     *  Space complexity : O(1) as no extra memory is required to traverse
     */
    public void traverseSinglyLinkedList(){
        if(head == null){
            System.out.println("The Singly Linked list does not exist");
        }
        else{
            Node tempNode = head;

            for(int i = 0 ; i < size; i++){
                System.out.print(tempNode.value);
                if( i != size - 1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }


    /**
     *  Time complexity : O(N)
     *  Space complexity : O(1) as no extra memory is required to search a node
     */
    public boolean searchNodeInLinkedList(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for( int i = 0 ; i < size; i++){
                if(tempNode.value == nodeValue){
                    System.out.print("Found the node at location : "+ i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node Not Found ");
        return false;
    }

    /**
     * Worst case time complexity for deleting node at the end : O(N)
     * Best case time complexity : O(N)
     * Space complexity : O(1)
     * @param location
     */
    public void deleteANodeFromLinkedList(int location) {

        if (head == null) {
            System.out.print("Singly Linked List not exist");
            return;
        } else if (location == 0) { // If to delete is requested at the beginning
            head = head.next; // If multiple nodes present in the list
            size--;

            if (size == 0) { // If only one node/element is present in the list after deletion
                tail = null;
            }
        } else if (location >= size) { // If to delete is requested at the end.
            Node tempNode = head; // Start from head and loop till the node before Last node
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if(tempNode == head){ // If tempNode == head that means only one element
                tail = head = null; // set tail and head references to null
                size--;
                return;
            }
            tempNode.next = null; // next reference of currentNode needs to updated to null
            tail = tempNode; // tail will be assigned to tempNode.
            size--;
        } else {
            Node tempNode = head; // as we will start looping from head
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next; // currentNode next reference will be referenced to the one after the deleted node
            size--;
        }
    }

    /**
     * Time and Space Complexity will be O(1) as no memory or time needed for the operations.
     */
    public void deleteEntireSinglyLinkedList(){
        head = null;
        tail = null;
        System.out.print("The SLL got deleted successfully");
    }
}


class Main {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createSinglyLinkedLList(5);
        System.out.println("Created a Singly list for nodeValue as : "+ singlyLinkedList.head.value);
        singlyLinkedList.insertInLinkedList(6,1);
        singlyLinkedList.insertInLinkedList(7,2);
        singlyLinkedList.insertInLinkedList(9,3);
        singlyLinkedList.insertInLinkedList(8,3);
        System.out.println("Created a Singly list for nodeValue as : "+ singlyLinkedList.head.next.next.next.next.value);
        singlyLinkedList.traverseSinglyLinkedList();
        singlyLinkedList.searchNodeInLinkedList(7);
        singlyLinkedList.searchNodeInLinkedList(10);

        singlyLinkedList.deleteANodeFromLinkedList(3);
        singlyLinkedList.deleteANodeFromLinkedList(0);
        singlyLinkedList.deleteANodeFromLinkedList(2);
        singlyLinkedList.traverseSinglyLinkedList();
        singlyLinkedList.deleteEntireSinglyLinkedList();
    }
}