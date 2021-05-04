package com.stackandqueue;

public class Queue<T> {
    private LinkedList<T> myLinkedList;
    public Queue() {
        myLinkedList = new LinkedList<>();
    }

    public void enqueue(T data) {
        myLinkedList.append(data);
    }

    public T dequeue() {
        T top = myLinkedList.head.getData();
        myLinkedList.pop();
        return top;
    }

    public void print() {
        myLinkedList.display();
    }

    public boolean isEmpty() {
        if(myLinkedList.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return myLinkedList.size();
    }
}
