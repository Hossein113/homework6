
package com.homework.jdbc.example.util;

public class Linkedlist<E> {


    private int size = 0;

    private Node<E> first;

    private Node<E> last;


    public int size() {
        return size;
    }


    public boolean addToFirst(E e) {

        Node<E> newNode = new Node<>(null, e, first);
        if (size == 0) {
            last = newNode;

        } else {

            first.setPrev(newNode);
        }
        first = newNode;
        size++;
        return true;
    }

}

