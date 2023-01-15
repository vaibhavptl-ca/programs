package com.vaibhav.samples.linkedlist;

class LinkedListNode{
    public LinkedListNode next;
    public int valueOfNode;
}

class Output{

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(4);
//        System.out.println("Created a Singly list for nodeValue as : "+ linkedList.head.valueOfNode);
        linkedList.insertIntoLinkedListNode(5,1);
        linkedList.insertIntoLinkedListNode(10,2);
        linkedList.insertIntoLinkedListNode(2,3);
        linkedList.insertIntoLinkedListNode(22,3);
        linkedList.insertIntoLinkedListNode(12,4);
        linkedList.traverseLinkedList();
        linkedList.searchLinkedList(4);
        linkedList.deleteTheNodeFromTheList(3);
    }
}

public class LinkedList {
    public LinkedListNode head;
    public LinkedListNode tail;
    public int size;

    public LinkedListNode createLinkedList(int nodeValue){
        if(head != null){
            System.out.println("Linked List can't be created as it already exists");
        }
        LinkedListNode node = new LinkedListNode();
        node.valueOfNode = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1 ;
        return head;
    }

    public void insertIntoLinkedListNode(int nodeValue, int location){
        // Insert at the beginning
        LinkedListNode node = new LinkedListNode();
        node.valueOfNode = nodeValue;

        if(head == null){
            createLinkedList(nodeValue);
            return;
        }
        else if(location == 0){
            node.next = head;
            head = node;
        }
        // Insert at the End
        else if(location > size){
            node.next = null;
            tail.next = node;
            tail = node;
        }
        // Insert at the Specified location
        else{
            LinkedListNode tempNode = head;
            int index = 0;

            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }

            LinkedListNode nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    /**
     *  Traverse through the linked list
     */
    public void traverseLinkedList(){
        // check if list exists
        if(head == null){
            System.out.println("There is no linked list present to travers");
        }
        else {
            LinkedListNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.valueOfNode+ "["+i+"]");
                // Below will check if we have visited all the elements in the list
                if(i != size - 1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    public boolean searchLinkedList(int location){
        if(head == null){
            System.out.println("There is no linked list present to traverse");
        }
        else{
            LinkedListNode tempNode = head;
            for(int i = 0; i < location; i++){
                if(location == i){
                    System.out.println("Found the node at location : "+ i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node Not Found ");
        return false;
    }

    public void deleteTheNodeFromTheList(int location){
        if(head == null){
            System.out.println("There is no linked list present to Delete node from!");
        }
        // Delete at the beginning
        else if(location == 0){
            head = head.next;
            size--;

            if(size == 0){
                tail = null;
            }
        }
        // Delete at last location
        else if(location >= size){
            LinkedListNode tempNode = head;
            for(int i =0; i < size -1 ; i++){
                tempNode = tempNode.next;
            }
            if(tempNode == head){
               tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }
        // Delete at the Specified location
        else {
            LinkedListNode tempNode = head;
            for(int i = 0 ; i <location -1 ; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

}


