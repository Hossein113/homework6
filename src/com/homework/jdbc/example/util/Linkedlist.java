
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

    /*public boolean remove(int index) {
        if (size != 0) {
            if (size / 2 >= index) {
                int firstCount = 0;
                Node<E> curentNode = first;
                while (true) {
                    if (index == firstCount) {
                        Node<E> next = curentNode.getNext();
                        Node<E> prev = curentNode.getPrev();
                        prev.setNext(next);
                        next.setPrev(prev);
                        break;
                    }
                    firstCount++;
                    curentNode = curentNode.getNext();
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
    }*/

    public boolean remove(int index) {
        if (index > size - 1) {
            System.out.println("index no of Range");
            return false;
        }
        if (size != 0) {
            int form = size / 2;
            if (form >= index) {
                int firstCount = 0;
                Node<E> currentNode = first;
                while (true) {
                    if (index == 0) {

                        Node<E> next = currentNode.getNext();
                        next.setPrev(null);
                        first = next;

                        break;
                    } else {
                        if (index == firstCount) {
                            Node<E> next = currentNode.getNext();
                            Node<E> prev = currentNode.getPrev();
                            if (prev != null) {
                                prev.setNext(next);
                            }
                            next.setPrev(prev);
                            break;
                        } else {
                            currentNode = currentNode.getNext();
                            firstCount++;
                        }
                    }
                }
            } else {
                int endCount = size - 1;
                Node<E> curentNode = last;
                while (true) {
                    if (index == endCount) {
                        Node<E> next = curentNode.getNext();
                        Node<E> prev = curentNode.getPrev();
                        if (next != null) {
                            next.setPrev(prev);
                        }
                        prev.setNext(next);
                        break;
                    } else {
                        curentNode = curentNode.getPrev();
                        endCount--;
                    }
                }
            }
            size--;
            return true;
        }
        return false;
    }

    public boolean isEmpity() {
        if (size == 0) {
            return true;
        } else
            return false;
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

    public void printList() {
        Node<E> curentNode = first;
        System.out.print("List: {");
        for (int i = 0; i < size; i++) {
            System.out.print(curentNode + " , ");

            curentNode = curentNode.getNext();
        }

        System.out.println(" }");


    }


    public String toString() {
        return
                "size=" + size;

    }
}

