/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 06-Mar-20
 *  Time: 2:04 PM
 */
package node;

public class Node {
    // a field to store information
    private int data;
    // a filed to keep reference of next node
    private Node next;

    // parameterized constructor with data field
    public Node(int data) {
        this.data = data;
        next = null;
    }

    //getter and setter for data and next field
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
