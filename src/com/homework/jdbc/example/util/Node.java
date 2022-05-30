package com.homework.jdbc.example.util;

public class Node<E> {

    private E item;
    private Node<E> next;
    private Node<E> prev;

    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public E getItem() {
        return item;
    }


    @Override
    public String toString() {
        return
                "" + item;
    }
}
