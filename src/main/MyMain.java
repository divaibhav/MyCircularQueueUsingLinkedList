/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 06-Mar-20
 *  Time: 2:32 PM
 */
package main;

import myqueue.MyCircularQueue;
import node.Node;
// a driver class to test MyCircularQueue implementation
public class MyMain {
    public static void main(String[] args) {
        // creating a circular queue i.e. creating object of MyCircularQueue
        MyCircularQueue circularQueue = new MyCircularQueue();
        // inserting elements in queue
        circularQueue.enqueue(200);
        circularQueue.enqueue(400);
        circularQueue.enqueue(677);

        // getting front element
        Node peek = circularQueue.peek();
        if (peek != null) {
            System.out.println(peek.getData() + " front of queue");
        }
        // removing front element
        Node delete = circularQueue.dequeue();
        if (delete != null) {
            System.out.println(delete.getData() + "  deleted front of queue");
        }

        // getting front element agian
        peek = circularQueue.peek();
        if (peek != null) {
            System.out.println(peek.getData() + " front of queue");
        }

    }
}
