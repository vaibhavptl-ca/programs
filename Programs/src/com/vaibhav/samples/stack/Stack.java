package com.vaibhav.samples.stack;

import java.sql.Time;

public class Stack {

    int[] array;
    int topOfStack;

    /**
     * Time : O(1)
     * Space : O(N)
     */
    public Stack(int size){
        this.array = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack created with size of : "+size);
    }


    /**
     * Time : O(1) and Space O(1)
     * @return
     */
    public boolean isEmpty(){
        if(topOfStack == -1){
            System.out.println("Stack Empty");
            return true;
        }
        return false;
    }


    /**
     * Time : O(1) and Space O(1)
     * @return
     */
    public boolean isFull(){
        if(topOfStack == array.length-1){
            return true;
        }
        return false;
    }

    /**
     * Time : O(1) and Space O(1)
     * @return
     */
    public void push(int value){
        if(isFull()){System.out.println("Stack is Full");}
        else {
           array[topOfStack+1] = value;
           topOfStack++;
            System.out.println("Value is inserted");
        }
    }


    /**
     * Time: O(1)
     * Space : O(1)
     * @return
     */
    public int pop(){
        if(isEmpty()){
            System.out.println("No Elements in Stack");
            return -1;
        }
        else{
            int topStack = array[topOfStack];
            topOfStack--;
            return topStack;
        }
    }


    /**
     * Peek method to return the top value
     * Time : O(1) , Space : O(1)
     */
    public int peek(){
        if(isEmpty()){
            System.out.println("No Elements in Stack");
            return -1;
        }
        else {
            int peekValue = array[topOfStack];
            return peekValue;
        }
    }

    /**
     * Peek method to return the top value
     * Time : O(1) , Space : O(1)
     */
    public void delete(){
        array = null;
        System.out.println("Stack is deleted successfully");
    }

    public static void main(String[] args){
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(3);

        int pop = stack.pop();
        System.out.println(pop);

        System.out.println(stack.peek());
        System.out.println(stack.peek());
        stack.delete();
    }

}
