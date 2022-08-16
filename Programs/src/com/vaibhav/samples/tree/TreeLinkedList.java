package com.vaibhav.samples.tree;

import java.util.LinkedList;
import java.util.Queue;

class Main {

    public static void main(String[] args) {
        TreeLinkedList binaryTree = new TreeLinkedList();
        binaryTree.insertInTree("N1");
        binaryTree.insertInTree("N2");
        binaryTree.insertInTree("N3");
        binaryTree.insertInTree("N4");
        binaryTree.insertInTree("N5");
        binaryTree.insertInTree("N6");
        binaryTree.insertInTree("N7");
        binaryTree.insertInTree("N8");
        binaryTree.insertInTree("N9");
        binaryTree.levelOrderTraversal();


        System.out.println();
//        binaryTree.preOrderTraversal(binaryTree.root);
//        binaryTree.inOrderTraversal(binaryTree.root);
//        binaryTree.postOrderTraversal(binaryTree.root);
//        binaryTree.levelOrderTraversal();
//        binaryTree.searchTree("N4");
//        System.out.println(binaryTree.getDeepestNode().value);
//        binaryTree.deleteAGivenNode("N4");
//        binaryTree.levelOrderTraversal();
//        binaryTree.deleteEntireTree();
    }

}

public class TreeLinkedList {
    BinaryNode root;

    public TreeLinkedList() {
        this.root = null;
    }


    /**
     * Time: O(N)
     * Space: O(N)
     *
     * @param node
     */
    public void preOrderTraversal(BinaryNode node) {
        if (node == null) return;
        System.out.print(node.value + "  ");
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }

    /**
     * Time: O(N)
     * Space: O(N)
     *
     * @param node
     */
    public void inOrderTraversal(BinaryNode node) {
        if (node == null) return;
        inOrderTraversal(node.leftChild);
        System.out.print(node.value + "  ");
        inOrderTraversal(node.rightChild);
    }


    /**
     * Time: O(N)
     * Space: O(N)
     *
     * @param node
     */
    public void postOrderTraversal(BinaryNode node) {
        if (node == null) return;
        postOrderTraversal(node.leftChild);
        postOrderTraversal(node.rightChild);
        System.out.print(node.value + "  ");
    }


    /**
     * Time: O(N)
     * Space: O(N)
     */
    public void levelOrderTraversal() {

        Queue<BinaryNode> queue = new LinkedList<BinaryNode>(); // Linked List will work as queue and queue will be interface
        queue.add(root); // adding first element

        while (!queue.isEmpty()) { // checks if queue is not empty
            BinaryNode presentNode = queue.remove(); // create a node which will store first node in the tree
            System.out.print(presentNode.value + " ");
            if (presentNode.leftChild != null) {
                queue.add(presentNode.leftChild);
            }
            if (presentNode.rightChild != null) {
                queue.add(presentNode.rightChild);
            }
        }
    }

    /**
     * Time: O(N)
     * Space: O(N)
     * Use Level Order Traversal
     */
    public void searchTree(String value) {

        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.print("Value found at tree : " + value);
                return;
            } else {
                if (presentNode.leftChild != null) {
                    queue.add(presentNode.leftChild);
                }
                if (presentNode.rightChild != null) {
                    queue.add(presentNode.rightChild);
                }
            }
        }
        System.out.print("Value not found at tree : " + value);

    }

    /**
     * Time: O(N)
     * Space: O(N)
     * Use Level Order Traversal
     */
    public void insertInTree(String value) {

        BinaryNode newNode = new BinaryNode();
        newNode.value = value;

        if (root == null) {
            root = newNode;
            System.out.print("Inserted node at root : ");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.leftChild == null) {
                presentNode.leftChild = newNode;
                break;
            }
            else if (presentNode.rightChild == null) {
                presentNode.rightChild = newNode;
                break;
            }
            else {
                queue.add(presentNode.leftChild);
                queue.add(presentNode.rightChild);
            }
        }
    }


    //Gets the deepest node
    public BinaryNode getDeepestNode(){

        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;

        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.leftChild != null){
                queue.add(presentNode.leftChild);
            }
            if(presentNode.rightChild != null){
                queue.add(presentNode.rightChild);
            }
        }
        return presentNode;
    }

    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.leftChild == null){
                previousNode.rightChild = null;
                return;
            }
            else if(presentNode.rightChild == null){
                presentNode.leftChild = null;
                return;
            }
            else{
                queue.add(presentNode.leftChild);
                queue.add(presentNode.rightChild);
            }
        }

    }


    /**
     *  Time and Space : O(N)
     * @param value
     */
    public void deleteAGivenNode(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();

            if(presentNode.value == value){
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Node is Deleted");
                return;
            }
            else{
                if(presentNode.leftChild != null) {
                    queue.add(presentNode.leftChild);
                }
                if(presentNode.rightChild != null){
                    queue.add(presentNode.rightChild);
                }
            }
            System.out.println("Node does not exist in BT");
        }

    }

    /**
     *  Time and Space : O(1)
     */

    public void deleteEntireTree(){
        root = null;
        System.out.println("Deleted the tree");
    }
}

class BinaryNode {
    public String value;
    public BinaryNode leftChild;
    public BinaryNode rightChild;
    public int height;
}