/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 06-Mar-20
 *  Time: 2:32 PM
 */
package main;

import myqueue.MyCircularQueue;
import node.Node;

public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue();
        circularQueue.enqueue(200);
        circularQueue.enqueue(400);
        //circularQueue.enqueue(677);

        Node peek = circularQueue.peek();
        if (peek != null) {
            System.out.println(peek.getData() + "front of queue");
        }

    }
}
