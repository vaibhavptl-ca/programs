package com.vaibhav.samples.queue;

public class Queue {

    public int[] array;
    public int beginningOfQueue;
    public int topOfQueue;

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.isFull();
    }

    /**
     * Time : O(1)
     * Space : O(N)
     *
     * @param size
     */
    public Queue(int size) {
        this.array = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Queue created with size of : " + size);
    }

    public boolean isFull() {
        if (topOfQueue == array.length - 1) {
            System.out.println("Queue is Full");
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (beginningOfQueue == -1 || beginningOfQueue == array.length) {
            System.out.println("Queue is empty");
            return true;
        }
        return false;
    }

    public void enQueue(int value) {

        if (isFull()) {
            System.out.println("Queue is already full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            array[topOfQueue] = value;
            System.out.println("Successfully inserted"+ value +"value in Queue");
        } else {
            topOfQueue++;
            array[topOfQueue] = value;
            System.out.println("Successfully inserted"+ value +"value in Queue");
        }

    }

    public int deQueue(int value){
        if(isEmpty()){
            System.out.println("No Elements in Queue are present to DeQueue");
            return -1;
        }
        else {
           int result = array[beginningOfQueue];
           beginningOfQueue++;
           if(beginningOfQueue > topOfQueue){
               beginningOfQueue = -1;
               topOfQueue = -1;
           }
           return result;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("No Elements in Queue are present to DeQueue");
            return -1;
        }
        else {
            int result = array[beginningOfQueue];
            return result;
        }
    }

    public void delete(){
        array = null;
        System.out.println("Queue Deleted Successfully");
    }
}
