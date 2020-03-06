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
    Node rear;

    public void enqueue(int data) {
        Node node = new Node(data);
        if (rear == null) {
            rear = node;
            //giving circular behaviour
            node.setNext(node);
        } else {
            rear.setNext(node);
            rear = node;
            //giving circular behaviour
            node.setNext(node);
        }
    }

    public Node dequeue() {
        Node response = null;
        if (rear != null) {
            response = rear.getNext();
            //only a single node
            if (rear.getNext() == rear) {
                rear = null;
            } else {
                rear.setNext(response.getNext());
            }
        }

        return response;
    }

}
