package com.vaibhav.samples.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    BST rootNode;

    public static void main(String[] args){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(70);
        binarySearchTree.insert(50);
        binarySearchTree.insert(90);
        binarySearchTree.insert(30);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        binarySearchTree.insert(100);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        System.out.println();
        binarySearchTree.preOrderTraversal(binarySearchTree.rootNode);
        System.out.println();
        binarySearchTree.inOrderTraversal(binarySearchTree.rootNode);
        System.out.println();
        binarySearchTree.postOrderTraversal(binarySearchTree.rootNode);
        System.out.println();
        binarySearchTree.levelOrderTraversal();
        System.out.println();
//        binarySearchTree.searchNode(binarySearchTree.rootNode, 40);
        binarySearchTree.deleteNode(binarySearchTree.rootNode, 50);
        binarySearchTree.levelOrderTraversal();
        binarySearchTree.deleteBST();
    }

    public BinarySearchTree(){
        this.rootNode = null;
    }

    /**
     * Recursive calll for left/right subtree
     * Time and Space : O(LogN)
     *
     * @param currentNode
     * @param value
     * @return
     */
    public BST insert(BST currentNode, int value){
        if(currentNode == null){
            BST node = new BST();
            node.value = value;
//            System.out.println("Node inserted in to BST");
            return node;
        }
        else if(value <= currentNode.value){
            currentNode.leftChild = insert(currentNode.leftChild,value);
            return currentNode;
        }
        else {
            currentNode.rightChild = insert(currentNode.rightChild, value);
            return currentNode;
        }
    }

    void insert(int value){
        rootNode = insert(rootNode,value);
    }


    /**
     * Time and Space : O(N)
     * @param node
     */
    public void preOrderTraversal(BST node){
        if(node == null) return;
        System.out.print(node.value + "  ");
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }

    public void inOrderTraversal(BST node){
        if(node == null) return;
        inOrderTraversal(node.leftChild);
        System.out.print(node.value+ "  ");
        inOrderTraversal(node.rightChild);
    }

    public void postOrderTraversal(BST node){
        if(node == null) return;
        postOrderTraversal(node.leftChild);
        postOrderTraversal(node.rightChild);
        System.out.print(node.value + "  ");
    }

    /**
     *  Time and Space : O(N)
     */
    public void levelOrderTraversal(){
        Queue<BST> queue = new LinkedList<BST>();
        queue.add(rootNode);

        while(!queue.isEmpty()){
            BST presentNode = queue.remove();
            System.out.print(presentNode.value + "  ");
            if(presentNode.leftChild != null){
                queue.add(presentNode.leftChild);
            }
            if(presentNode.rightChild != null){
                queue.add(presentNode.rightChild);
            }
        }
    }


    /**
     *  Time & Space : O(LogN)
     * @param node
     * @param value
     * @return
     */
    public BST searchNode(BST node, int value){
        Queue<BST> queue = new LinkedList<BST>();
        queue.add(rootNode);

        if(node == null) return null;
        else if(node.value == value){
            System.out.println("Value "+ value +" found in BST");
            return node;
        }
        else if(value < node.value){
            return searchNode(node.leftChild, value);
        }
        else {
            return searchNode(node.rightChild,value);
        }
    }

    public BST getSuccessor(BST root){
        if(root.leftChild == null){
            return root;
        }
        else {
            return getSuccessor(root.leftChild);
        }
    }

    /**
     *  Time and Space : O(N)
     * @param root
     * @param value
     * @return
     */
    public BST deleteNode(BST root, int value){
        if(root == null){
            System.out.println("Value not found in BST");
            return null;
        }
        if(value < root.value){
            root.leftChild = deleteNode(root.leftChild, value);
        }
        else if(value > root.value){
            root.rightChild = deleteNode(root.rightChild, value);
        }else {
            if(root.leftChild != null && root.rightChild != null){ // Who has 2 children
                BST tempNode = root;
                BST minNodeOfRight = getSuccessor(tempNode.rightChild);
                root.value = minNodeOfRight.value;
                root.rightChild = deleteNode(root.rightChild, minNodeOfRight.value);
            }
            if(root.leftChild != null){ // One Children
                root = root.leftChild;
            }
            else if(root.rightChild != null){
                root = root.rightChild;
            }
            else{
                root = null;
            }
        }
        return root;
    }

    /**
     *  Time and Space : O(1)
     */
    public void deleteBST(){
        rootNode = null;
        System.out.println("BST deleted Successfully");
    }
}

class BST{

    public int value;
    public int height;
    public BST leftChild;
    public BST rightChild;
}
