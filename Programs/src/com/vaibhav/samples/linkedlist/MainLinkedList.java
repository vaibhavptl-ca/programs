package com.vaibhav.samples.linkedlist;

import java.util.HashSet;

public class MainLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public static void main(String[] args){
        MainLinkedList mainLinkedList = new MainLinkedList();
        mainLinkedList.createLinkedLList(1);
        mainLinkedList.insertNode(2);
        mainLinkedList.insertNode(7);
        mainLinkedList.insertNode(4);
        mainLinkedList.insertNode(6);
        mainLinkedList.insertNode(2);
        mainLinkedList.insertNode(3);
        mainLinkedList.insertNode(8);
        mainLinkedList.traverseLinkedList();

        RemoveDupes removeDupes = new RemoveDupes();
        removeDupes.deleteDupes(mainLinkedList);
        mainLinkedList.traverseLinkedList();


        ReturnNthTOLast returnNthTOLast = new ReturnNthTOLast();
        Node node = returnNthTOLast.returnNthLast(mainLinkedList, 4);
        System.out.println("Node Value is : "+node.value);

        mainLinkedList.traverseLinkedList();
        Partition partition = new Partition();
        partition.partitionOnLL(mainLinkedList, 5);
        mainLinkedList.traverseLinkedList();


        MainLinkedList llA = new MainLinkedList();
        llA.insertNode(7);
        llA.insertNode(1);
        llA.insertNode(6);

        MainLinkedList llB = new MainLinkedList();
        llB.insertNode(5);
        llB.insertNode(9);
        llB.insertNode(2);

        SumList sumList = new SumList();
        MainLinkedList result = sumList.add2LinkedLists(llA, llB);
        result.traverseLinkedList();



        MainLinkedList ll1 = new MainLinkedList();
        ll1.insertNode(3);
        ll1.insertNode(1);
        ll1.insertNode(5);
        ll1.insertNode(9);
        ll1.traverseLinkedList();

        MainLinkedList ll2 = new MainLinkedList();
        ll2.insertNode(2);
        ll2.insertNode(4);
        ll2.insertNode(6);
        ll2.traverseLinkedList();

        Intersecting intersecting = new Intersecting();
        intersecting.addSameNode(ll1,ll2, 7);
        intersecting.addSameNode(ll1,ll2, 2);
        intersecting.addSameNode(ll1,ll2, 1);
        Node intersection = intersecting.intersection(ll1,ll2);
        System.out.print(intersection.value);
    }

    public void createLinkedLList(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }

    public void insertNode(int nodeValue){

        if(head == null){
            createLinkedLList(nodeValue);
            return;
        }

        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }

    public void traverseLinkedList(){
        Node tempNode = head;
        for(int i = 0; i < size; i++){
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print("->");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

}


class RemoveDupes{

    public void deleteDupes(MainLinkedList mainLinkedList){
        HashSet<Integer> set = new HashSet<>();
        Node currentNode = mainLinkedList.head;
        Node previous = null;

        while(currentNode != null){
            int currentVal = currentNode.value;
            if(set.contains(currentVal)){
                previous.next = currentNode.next;
                mainLinkedList.size--;
            }
            else {
                set.add(currentVal);
                previous = currentNode;
            }
            currentNode = currentNode.next;
        }
    }
}


class ReturnNthTOLast{

    public Node returnNthLast(MainLinkedList linkedList, int location){
        Node p1 = linkedList.head;
        Node p2 = linkedList.head;

        for(int i = 0 ; i < location; i++){
         if(p2 == null) return null;
         p2 = p2.next;
        }

        while( p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

}


class Partition{

    public MainLinkedList partitionOnLL(MainLinkedList linkedList, int n){

        Node currentNode = linkedList.head;
        linkedList.tail = linkedList.head;

        while (currentNode != null){
            Node nextNode = currentNode.next;
            if(currentNode.value < n){
                currentNode.next = linkedList.head;
                linkedList.head = currentNode;
            }
            else {
                linkedList.tail.next = currentNode;
                linkedList.tail = currentNode;
            }
            currentNode = nextNode;
        }
        linkedList.tail.next = null;
        return linkedList;
    }

}

class SumList{

    public MainLinkedList add2LinkedLists(MainLinkedList linkedListA,MainLinkedList linkedListB) {

        Node n1 = linkedListA.head;
        Node n2 = linkedListB.head;

        int carry = 0;
        MainLinkedList resultList = new MainLinkedList();

        while (n1 != null || n2 != null){
            int result = carry;
            if(n1 != null){
                result += n1.value;
                n1 = n1.next;
            }
            if(n2 != null){
                result += n2.value;
                n2 = n2.next;
            }

            resultList.insertNode(result%10);
            carry = result/ 10;
        }
        return  resultList;
    }
}

class Intersecting{

    public Node getKthNode(Node head, int k){
        Node current = head;
        while(k>0 && current != null){
            current =current.next;
            k--;
        }
        return current;
    }

    public Node intersection(MainLinkedList ll1, MainLinkedList ll2){
        if(ll1.head == null || ll2.head == null) return null;

        if(ll1.tail != ll2.tail) return null;

        Node shorter = new Node();
        Node longer = new Node();

        if(ll1.size > ll2.size){
            longer = ll1.head;
            shorter = ll2.head;
        }
        else{
            shorter = ll1.head;
            longer = ll2.head;
        }
        longer = getKthNode(longer, Math.abs(ll1.size - ll2.size));

        while (shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }
        return  longer;
    }


    void addSameNode(MainLinkedList linkedList1, MainLinkedList linkedList2, int nodeValue){

        Node node= new Node();
        node.value = nodeValue;

        linkedList1.tail.next = node;
        linkedList1.tail = node;
        linkedList2.tail.next = node;
        linkedList2.tail = node;
    }
}