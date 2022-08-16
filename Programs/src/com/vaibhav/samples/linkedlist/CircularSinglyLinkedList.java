package com.vaibhav.samples.linkedlist;

public class CircularSinglyLinkedList {
    public Node head; // Head of the Node
    public Node tail; // Tail of the Node
    public int size;



    /**
     * Time Complexity will be O(1)
     * Space Complexity will be O(1)
     *
     * @param nodeValue
     * @return
     */
    public Node createCircularSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node; // nextReference to node assigned as current node
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    /**
     * Time Complexity will be O(N)
     * Space Complexity will be O(1)
     *
     * @param nodeValue
     * @param location
     */
    public void insertIntoCircularSinglyLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            createCircularSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = node;
            return;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
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

    public void traverseCSLL(){

        Node tempNode  = head;

        if(head!=null){
            for( int i = 0 ; i < size ; i++){
                System.out.print("Nodes are as :" + tempNode.value);
                if(i != size-1){
                    System.out.print("--");
                }
                tempNode = tempNode.next;
            }

            System.out.print(" \n");
        }
        else{
            System.out.println("\n No CLL List exists");
        }
    }

    public boolean searchCSLL(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for( int i = 0 ; i < size ; i++){
                if( tempNode.value == nodeValue){
                    System.out.print(" Found the node at : "+i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node Not Found ");
        return false;
    }


    public void deleteFromCSLL(int location){
        if(head == null){
            System.out.println("CSLL does not exist");
            return;
        }
        else if(location == 0){
            head = head.next; // If more thenn one element
            tail.next = head;
            size--;
            if(size == 0){
                tail = head = head.next = null;
            }
        }
        else if( location >= size){ // at the end
            Node tempNode = head;
            for (int i =0; i < size-1; i++){
                tempNode = tempNode.next;
            }

             if(tempNode == head){
                 tail = head = head.next = null;
                 return;
             }

             tempNode.next = head;
             tail = tempNode;
             size--;
        }
        else {

            Node tempNode = head;
            for (int i =0; i < size-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteCSLL(){
        if(head == null){
            System.out.println("No CSLL present");
        }
        else{
            tail = head = head.next = null;
            System.out.println("The CSLL has been deleted");
        }
    }



    public static void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        circularSinglyLinkedList.createCircularSinglyLinkedList(5);
        circularSinglyLinkedList.insertIntoCircularSinglyLinkedList(4,0);
        circularSinglyLinkedList.insertIntoCircularSinglyLinkedList(4,1);
        circularSinglyLinkedList.insertIntoCircularSinglyLinkedList(4,8);
        System.out.println("Node Value as : " + circularSinglyLinkedList.head.value);
    }
}
