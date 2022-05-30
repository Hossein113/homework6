
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
                    curentNode = curentNode.getNext();
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

                    curentNode = curentNode.getNext();
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

        return size == 0;
    }

    public boolean exist(E e) {

        if (size != 0) {
            Node<E> curentNode = first;
            for (int i = 0; i < size; i++) {


                if (curentNode.getItem().equals(e)) {
                    return true;


                } else {
                    curentNode = curentNode.getNext();
                }
            }
        }

        return false;
    }
}