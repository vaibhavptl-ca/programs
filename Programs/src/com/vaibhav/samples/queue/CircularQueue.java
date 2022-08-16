package com.vaibhav.samples.queue;

public class CircularQueue {
    public int[] array;
    public int beginningOfQueue;
    public int topOfQueue;
    public int size;

    /**
     * Time : O(1)
     * Space : O(N)
     *
     * @param size
     */
    public CircularQueue(int size) {
        this.array = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Queue created with size of : " + size);
    }

    public boolean isEmpty(){
        if(beginningOfQueue == -1 || topOfQueue == -1 || size == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(topOfQueue + 1 == beginningOfQueue){
            return true;
        }else if(beginningOfQueue == 0 && topOfQueue+1 == size){
            return true;
        }
        return false;
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            array[topOfQueue] = value;
            System.out.println("Value inserted successfully");
        }
        else{
            if(topOfQueue + 1 == size){
                topOfQueue = 0;
            }else {
                topOfQueue++;
            }
            array[topOfQueue] = value;
            System.out.println("Value inserted successfully");
        }
    }

    public int deQueue(){
        if(isEmpty()) return -1;
        else{
            int result = array[beginningOfQueue];
            array[beginningOfQueue] = 0;

            if(beginningOfQueue == topOfQueue){
                beginningOfQueue = -1;
                topOfQueue = -1;
            }
            else if(beginningOfQueue+1 == size){
                beginningOfQueue = 0;
            }
            else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    public int peek(){
        if(isEmpty()) return -1;
        else return array[beginningOfQueue];
    }

    public void delete(){
        array = null;
        System.out.println("CQ is deleted");
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enQueue(2);
        queue.enQueue(4);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(1);
        queue.enQueue(3);
        queue.enQueue(5);
    }
}
