/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 06-Mar-20
 *  Time: 2:06 PM
 */
package myqueue;

import node.Node;

public class MyCircularQueue {
    //taking only tail reference
    private Node rear;
    //to store total number of elements in queue
    private int size;

    //a method to add new element at rear
    public void enqueue(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            rear = node;
            size++;
            //giving circular behaviour
            node.setNext(node);
        } else {
            //giving circular behaviour
            node.setNext(rear.getNext());
            rear.setNext(node);
            rear = node;
            size++;

        }
    }

    //a method to remove element from front of queue
    public Node dequeue() {
        Node response = null;
        if (!isEmpty()) {

            response = rear.getNext();
            size--;
            //only a single node
            if (rear.getNext() == rear) {
                rear = null;
            } else {
                rear.setNext(response.getNext());
            }
        }

        return response;
    }

    //a method to get front elemen of queue
    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = rear.getNext();
        }
        return response;
    }

    // to get size of queue
    public int getSize() {
        return size;
    }

    // a method to check whether queue is empty
    public boolean isEmpty() {
        boolean response = false;
        if (rear == null) {
            response = true;
        }
        return response;
    }

}
