package com.stackandqueue;

public class Stack<T> {
    public LinkedList<T> myLinkedList;

    public Stack() {
        myLinkedList = new LinkedList<T>();
    }

    public void push(T data) {
        myLinkedList.insert(data);
    }

    public void print() {
        myLinkedList.display();
    }

    public  T peak() {
        return myLinkedList.head.getData();
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
