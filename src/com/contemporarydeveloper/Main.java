package com.contemporarydeveloper;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        System.out.print("MyQueue with 3 items: ");
        System.out.println(myQueue);

        Object dequeuedItem = myQueue.dequeue();
        System.out.print("Dequeued Item: ");
        System.out.println(dequeuedItem);
        System.out.print("My Queue with 1 item dequeued: ");
        System.out.println(myQueue);
    }
}
