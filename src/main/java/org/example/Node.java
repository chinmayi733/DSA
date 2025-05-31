package org.example;

public class Node {
    int data;
    Node next;
    public Node(int val,Node next)
    {
        this.data=val;
        this.next=next;
    }
    public Node(int val)
    {
        this.data=val;
        this.next=null;
    }

}
