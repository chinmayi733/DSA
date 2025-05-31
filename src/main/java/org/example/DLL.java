package org.example;

public class DLL {

    static class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.data = val;
            this.next = next;
            this.prev = prev;
        }
        public Node(int val) {
            this.data = val;
            this.next = null;
            this.prev = null;
        }
    }


    public Node insertHead(int val, Node head) {
        Node newNode = new Node(val);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    public Node insertTail(int val, Node head)
    {
        Node newNode = new Node(val);
        if(head==null)
            return newNode;
        Node temp =head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        return newNode;
    }

    public void deleteHead(Node head) {
        if (head == null) {
            return;
        }
        if (head.next != null) {
            head = head.next;
            head.prev = null;
        } else {
            head = null;
        }
    }

    public void deleteTail(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        if (temp.prev != null) {
            temp.prev.next = null;
        } else {
            head = null; // If the list becomes empty
        }
    }

    public void deleteByPosition(Node head, int position) {
        if (head == null || position < 1) {
            return;
        }
        if (position == 1) {
            deleteHead(head);
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp != null && count < position) {
            count++;
            temp = temp.next;
        }
        if (temp == null) {
            return; // Position is out of bounds
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    public Node insertAtPosition(int val, Node head, int position) {
        if (position < 1) {
            return head; // Invalid position
        }
        if (position == 1) {
            return insertHead(val, head);
        }
        Node newNode = new Node(val);
        Node temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            count++;
            temp = temp.next;
        }
        if (temp == null) {
            return head; // Position is out of bounds
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        return head;
    }

}
