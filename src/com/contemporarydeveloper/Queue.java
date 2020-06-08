package com.contemporarydeveloper;
import java.util.ArrayList;

class Queue<T> {
    private Node<T> front, back;

    private class Node<T> {
        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
        }
    }

    public void enqueue(T item) {
        if (front == null) {
            back = new Node(item);
            front = back;
        } else {
            Node<T> b = new Node(item);
            back.next = b;
            back = b;
        }
    }

    public T dequeue() {
        T item = null;
        if (front != null) {
            item = front.data;
            front = front.next;
        }

        return item;
    }

    @Override
    public String toString() {
        Node<T> current = front;
        ArrayList queueItems = new ArrayList<>();
        while (current != null) {
            queueItems.add(current.data);
            current = current.next;
        }

        return queueItems.toString();
    }
}