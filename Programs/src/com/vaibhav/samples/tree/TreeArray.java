package com.vaibhav.samples.tree;


public class TreeArray {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(9);
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");
        System.out.print("Pre Order Traversal :  ");
        binaryTree.preOrderTraversal(1);
        System.out.print("In Order Traversal :  ");
        binaryTree.inOrderTraversal(1);
        System.out.println();
        System.out.print("Post Order Traversal :  ");
        binaryTree.postOrderTraversal(1);
        System.out.println();
        binaryTree.levelOrderTraversal();
        binaryTree.searchArray("N7");
        binaryTree.deleteNode("N3");
        binaryTree.levelOrderTraversal();
        binaryTree.deleteBT();

    }
}


class BinaryTree{

    public String[] array;
    public int lastUsedIndex;

    /**
     * Time and Space : O(1) and O(N)
     */
    public BinaryTree(int size){
        array = new String[size+1]; //as we are not going to use first index
        this.lastUsedIndex = 0;
        System.out.println("Array Tree of Size "+size+ " has been created!!");
    }

    /**
     *  Time : O(1) and Space : O(1)
     * @return
     */
    public boolean isFull(){
        if(array.length-1 == lastUsedIndex){
            System.out.println("Binary Tree is Full");
            return true;
        }
        return false;
    }


    /**
     *  Time : O(1)
     *  Space : O(1)
     * @param value
     */
    public void insert(String value){
        if(!isFull()){
            array[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.print("Node value "+value+" has been successfully inserted");
        }else {
            System.out.println("The Binary Tree is full");
        }
    }

    public void preOrderTraversal(int rootNodeIndex){
        if(rootNodeIndex> lastUsedIndex) return;

        System.out.print(array[rootNodeIndex] + " ");
        preOrderTraversal(rootNodeIndex * 2);
        preOrderTraversal(rootNodeIndex * 2 + 1);
    }

    public void inOrderTraversal(int rootNodeIndex){
        if(rootNodeIndex> lastUsedIndex) return;
        inOrderTraversal(rootNodeIndex * 2);
        System.out.print(array[rootNodeIndex] + " ");
        inOrderTraversal(rootNodeIndex * 2 + 1);
    }

    public void postOrderTraversal(int rootNodeIndex){
        if(rootNodeIndex> lastUsedIndex) return;

        postOrderTraversal(rootNodeIndex * 2);
        postOrderTraversal(rootNodeIndex * 2 + 1);
        System.out.print(array[rootNodeIndex] + " ");
    }

    public void levelOrderTraversal(){
        for(int i = 1; i <= lastUsedIndex; i++){
            System.out.print(array[i] + "  ");
        }
    }

    public int searchArray(String value){

        for(int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(array[i] + "  ");
            if (array[i] == value) {
                System.out.println("Found the value at " + i);
                return i;
            } else {
                System.out.println("Value not found");
            }
        }
        return -1;
    }

    public void deleteNode(String value){
        int location = searchArray(value);

        if(location == -1) return;
        else {
            array[location] = array[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("Node successfully deleted");
        }
    }

    public void deleteBT() {

        try {
            array = null;
            System.out.print("Binary Tree deleted");
        }
        catch (Exception ex){
            System.out.println("Error deleting the tree");
        }

    }
}