package com.vaibhav.samples.tree.avl;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {

    BinaryNode root;

    AVL(){
        root = null;
    }

    public void preOrderTraversal(BinaryNode node){
        if(node == null) return;
        System.out.print(node.value + "  ");
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }

    public void inOrderTraversal(BinaryNode node){
        if(node == null) return;
        inOrderTraversal(node.leftChild);
        System.out.print(node.value+ "  ");
        inOrderTraversal(node.rightChild);
    }

    public void postOrderTraversal(BinaryNode node){
        if(node == null) return;
        postOrderTraversal(node.leftChild);
        postOrderTraversal(node.rightChild);
        System.out.print(node.value + "  ");
    }

    /**
     *  Time and Space : O(N)
     */
    public void levelOrderTraversal(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
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
    public BinaryNode searchNode(BinaryNode node, int value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

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

    //getHeight
    public int getHeight(BinaryNode node){

        if(node == null){
            return 0;
        }
        return node.height;
    }

    private BinaryNode rotateRight(BinaryNode disbalancedNode){
        BinaryNode newRoot = disbalancedNode.leftChild;
        disbalancedNode.leftChild = disbalancedNode.leftChild.rightChild;
        newRoot.rightChild = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.leftChild), getHeight(disbalancedNode.rightChild));
        newRoot.height = 1 + Math.max(getHeight(newRoot.leftChild), getHeight(newRoot.rightChild));
        return newRoot;
    }

    private BinaryNode rotateLeft(BinaryNode disbalancedNode){
        BinaryNode newRoot = disbalancedNode.rightChild;
        disbalancedNode.leftChild = disbalancedNode.rightChild.leftChild;
        newRoot.leftChild = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.leftChild), getHeight(disbalancedNode.rightChild));
        newRoot.height = 1 + Math.max(getHeight(newRoot.leftChild), getHeight(newRoot.rightChild));
        return newRoot;
    }

    //getBalance
    public int getBalance(BinaryNode node){
        if(node == null){
            return 0;
        }
        return getHeight(node.leftChild) - getHeight(node.rightChild);
    }

    // insertNode
    private BinaryNode insert(BinaryNode node, int value){

        if(node == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            newNode.height = 1;
            return newNode;
        }
        else if (value < node.value){
            node.leftChild = insert(node.leftChild,value);
        }else {
            node.rightChild = insert(node.rightChild, value);
        }
        node.height = 1 + Math.max(getHeight(node.leftChild), getHeight(node.rightChild));

        int balance = getBalance(node);

        if(balance > 1 && value < node.leftChild.value){
            return rotateRight(node);
        }

        if(balance > 1 && value > node.leftChild.value){
            node.leftChild = rotateLeft(node.leftChild);
            return  rotateRight(node);
        }

        if(balance < -1 && value > node.rightChild.value){
            return rotateLeft(node);
        }

        if(balance < -1 && value < node.rightChild.value){
            node.rightChild = rotateRight(node.rightChild);
            return rotateLeft(node);
        }
        return node;
    }

    public void insert(int value){
        root = insert(root,value);
    }
}


class Main{

    public static void main(String[] args){
        AVL newAVL = new AVL();

        newAVL.insert(5);
        newAVL.insert(10);
        newAVL.insert(15);
        newAVL.insert(20);

        newAVL.levelOrderTraversal();

    }
}