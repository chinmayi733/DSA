package org.example;

public class StackLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int val, Node next) {
            this.data = val;
            this.next = next;
        }

        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }


    Node dummy = new Node(0,null);
    Node head = dummy;

    StackLinkedList() {
       this.head= dummy;
    }

    public Node push(int val) {
        Node newNode = new Node(val);
        if (head == dummy) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    public Node pop()
    {
        if(head!=dummy)
        {
            System.out.println("Popped: " + head.data);
            head = head.next;
        }
        else if(head==null)
        {
            System.out.println("Stack Underflow");
        }
        return head;
    }

    public int top() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.top());
        s.pop();
        s.pop();
        System.out.println(s.top());

    }
}
