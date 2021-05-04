package com.stackandqueue;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * uc1 : create simple linked list
     */
    public void insert(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    /**
     * uc2 : ability to create linked list by adding 30 and 56 to 70
     */
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    /**
     * uc3 : ability to create linkedList by appending
     */
    public void append(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /**
     * uc4 : ability to insert an element in between
     */
    public void insertInBetween(T newKey, T key) {
        Node<T> node = head;
        Node<T> temp;
        Node<T> newNode = new Node<T>(newKey);
        while(node != null) {
            if(node.getData() == key) {
                break;
            }
            node = node.getNext();
        }
        temp = node.getNext();
        node.setNext(newNode);
        newNode.setNext(temp);
    }

    /**
     * uc5 : ability to delete the first element
     */
    public void pop_first_element() {
        Node<T> node = head;
        head = node.getNext();
        node.setNext(null);
    }

    /**
     * uc6 : ability to delete the last element from the given sequence.
     */
    public void pop_Last_element() {
        Node<T> node = head;
        while(node.getNext() != tail) {
            node = node.getNext();
        }
        node.setNext(null);
        tail = node;
    }

    /**
     * uc7: ability to search LL to find node with certain value
     */
    public boolean find_Node_With_Given_value(T value) {
        Node<T> node = head;
        while(node != null) {
            if(node.getData() == value)
                return true;
            node = node.getNext();
        }
        return false;
    }

    /**
     * uc8: ability to insert number after given value to the LL sequence
     */
    public void insert_Number_After_Given_Node_Key(T newKey, T key) {
        Node<T> node = head;
        Node<T> temp;
        Node<T> newNode = new Node<T>(newKey);
        while (node != null) {
            if (node.getData() == key)
                break;
            node = node.getNext();
        }
        temp = node.getNext();
        node.setNext(newNode);
        newNode.setNext(temp);
    }

    /**
     * uc9: ability to delete element from linked list sequence
     */
    public void delete_Node_With_Given_Value(T key) {
        Node<T> node = head;
        Node<T> prev = null;
        while(node != null) {
            if(node.getData() == key)
                break;
            prev = node;
            node = node.getNext();
        }
        if(prev == null) {
            head = head.getNext();
        } else {
            prev.setNext(node.getNext());
            node.setNext(null);
        }
    }

    /**
     * uc10:
     */
    public void addLinkedList(T data) {
        Node<T> newNode = new Node<T>(data);
        if(head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node<T> temp = null, prev = null;
            temp = head;
            while(temp != null) {
                if(sort(temp,newNode) > 0) {
                    break;
                }
                prev = temp;
                temp = temp.getNext();
            }
            if(temp == head) {
                newNode.setNext(temp);
                head = newNode;
            }
            else if(temp == null) {
                prev.setNext(newNode);
                tail = newNode;
            } else {
                prev.setNext(newNode);
                newNode.setNext(temp);
            }
        }
    }

    private int sort(Node<T> temp, Node<T> newNode) {
        return ((Comparable) temp.getData()).compareTo(newNode.getData());
    }

    public void display() {
        Node<T> node = head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public int size() {
        int size = 0;
        Node<T> node = head;
        while (node != null) {
            size++;
            node = node.getNext();
        }
        return size;
    }
}
