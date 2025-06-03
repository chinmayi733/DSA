package org.example.Arrays;

public class QueueLinkedList {

        Node front;
        Node rear;

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

    QueueLinkedList() {
        front=null;
        rear=null;
    }

    public void enqueue(int val)
    {
        Node n = new Node(val);

        if(front==null)
        {
            front=n;
            rear=n;
        }
        else
        {
            rear.next=n;
            rear=n;
        }
    }

    public void dequeue()
    {
        if(front==null)
        {
            System.out.println("Queue is empty");
            return;
        }
        else
        if(front.next!=null){
            Node temp =front.next;
            front.next=null;
            front=temp;
        }
        else {
            System.out.println("Dequeued: " + front.data);
            front=null;
            rear=null;
        }
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Output: 10 20 30

        queue.dequeue(); // Dequeue 10
        queue.display(); // Output: 20 30

        queue.dequeue(); // Dequeue 20
        queue.display(); // Output: 30

        queue.dequeue(); // Dequeue 30
        queue.display(); // Output: Queue is empty
    }
}
