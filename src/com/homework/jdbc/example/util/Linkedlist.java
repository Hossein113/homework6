
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

    public boolean addToEnd(E e) {
        Node<E> newNode = new Node<>(last, e, null);
        if (size == 0) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
        size++;
        return true;
    }

    public boolean remove(int index) {
        if (size != 0) {
            if (size / 2 >= index) {
                int firstCount = 0;
                Node<E> curentNode = first;
                while (true) {
                    curentNode = curentNode.next;
                    if (index == firstCount) {
                        Node<E> next = curentNode.getNext();
                        Node<E> prev = curentNode.getPrev();
                        prev.setNext(next);
                        next.setPrev(prev);
                        break;

                    } else {
                        firstCount++;
                    }
                }

            } else if (size / 2 > index) {
                int endCount = size;
                Node<E> curentNode = last;

                while (true) {

                    curentNode = curentNode.next;
                    if (index == endCount) {
                        Node<E> next = curentNode.getNext();
                        Node<E> prev = curentNode.getPrev();
                        prev.setNext(next);
                        next.setPrev(prev);
                        break;

                    } else {
                        endCount--;
                    }
                }
            }
            size--;
            return true;

        } else {

            return false;
        }
    }


    public boolean isEmpity() {
        if (size == 0) {

        }
        return size == 0;
    }
}