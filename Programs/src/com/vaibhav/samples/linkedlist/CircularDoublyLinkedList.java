package com.vaibhav.samples.linkedlist;


/**
 *  Only Creation of CDLL takes O(1) rest all takes O(N) as Time Complexity
 *  Space Complexity for all of them is O(1)
 */
public class CircularDoublyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public static void main(String[] args) {
        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
        circularDoublyLinkedList.createCircularDLL(1);
        System.out.println("The Node's head is at : " + circularDoublyLinkedList.head.value);
        circularDoublyLinkedList.insertIntoCircularDLL(2, 1);
        circularDoublyLinkedList.insertIntoCircularDLL(5, 2);
        circularDoublyLinkedList.insertIntoCircularDLL(7, 3);
        circularDoublyLinkedList.insertIntoCircularDLL(9, 6);
        circularDoublyLinkedList.traverseCircularDLLL();
        System.out.println("The Node's tail is at : " + circularDoublyLinkedList.tail.value);
        circularDoublyLinkedList.searchCircularDLL(7);
        System.out.println();
        circularDoublyLinkedList.reverseTraversalDLL();
        circularDoublyLinkedList.deleteCircularDLL(2);
        System.out.println();
        circularDoublyLinkedList.traverseCircularDLLL();
        circularDoublyLinkedList.deleteEntireCircularDLL();
        circularDoublyLinkedList.traverseCircularDLLL();
    }

    /**
     * Time : O(1)
     * Space : O(1)
     *
     * @param nodeValue
     * @return
     */
    public Node createCircularDLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        node.previous = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertIntoCircularDLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCircularDLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            node.previous = tail;
            head.previous = node;
            tail.next = node;
            head = node;
        } else if (location >= size) {
            node.next = head;
            node.previous = tail;
            head.previous = node;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;

            while (index < location) {
                tempNode = tempNode.next;
                index++;
            }

            node.previous = tempNode;
            node.next = tempNode.next;
            tempNode.next = node;
            node.next.previous = node;
        }
        size++;
    }

    public void traverseCircularDLLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.print("\n No circular double linked list exist");
        }
        System.out.println("\n");
    }

    public boolean searchCircularDLL(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Node found at location : " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("No circular double linked list exist");
        return false;
    }

    public void reverseTraversalDLL() {
        if (head != null) {
            Node tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.previous;
            }
        } else {
            System.out.print("\n No circular double linked list exist");
        }
    }

    public void deleteCircularDLL(int location) {
        if (head == null) {
            System.out.println("No Circular Doubly Linked list present");
        } else if (location == 0) {
            if (size == 1) {
                head.next = null;
                head.previous = null;
                head = tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.previous = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size == 1) {
                head.next = null;
                head.previous = null;
                head = tail = null;
                size--;
                return;
            } else {
                tail = tail.previous;
                tail.next = head;
                head.previous = tail;
                size--;
            }
        } else {
            Node tempNode = head;
            for(int i=0 ; i < location -1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.previous = tempNode;
            size--;
        }
    }


    public void deleteEntireCircularDLL(){

        Node tempNode = head;
        tail.next = null;
        head.previous = null;

        for(int i = 0; i < size ; i++){
            tempNode.previous = null;
            tempNode = tempNode.next;
        }

        head = null;
        tail = null;

        System.out.print("The DLL has been deleted");
    }
}
