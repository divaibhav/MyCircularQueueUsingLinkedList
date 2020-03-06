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
    private int size;

    public void enqueue(int data) {
        Node node = new Node(data);
        if (rear == null) {
            rear = node;
            size++;
            //giving circular behaviour
            node.setNext(node);
        } else {
            rear.setNext(node);
            rear = node;
            size++;
            //giving circular behaviour
            node.setNext(node);
        }
    }

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

    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = rear.getNext();
        }
        return response;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        boolean response = false;
        if (rear == null) {
            response = true;
        }
        return response;
    }

}
