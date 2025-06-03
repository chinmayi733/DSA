package org.example;

import java.sql.SQLOutput;

public class QueueArray {

    int front;
    int rear;
    int size;
    int capacity;

    int[] a;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.front = -1;
        this.size = 0;
        this.rear= -1;// rear is at the end of the queue
        this.a = new int[capacity];
    }

    public void enqueue(int item)
    {
        if(size==capacity)
        {
            System.out.println("Queue is full");
            return;
        }
        else if(size==0)
        {
            front=0;
            rear=0;
            a[front]=item;
            size++;
        }
        else
        {
           rear=(rear+1)%capacity;
           size++;
           a[rear]=item;
        }
    }

    public void dequeue()
    {
        if(size==0)
        {
            front=-1;
            rear=-1;
        }
        else
        {
            System.out.println("Dequeued: " + a[front]);
            front=(front+1)%capacity;
            size--;

        }
    }

    public int front()
    {
        if(size==0)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else
        {
            return a[front];
        }
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Front element: " + queue.front());
        queue.dequeue();
        queue.enqueue(60);
        System.out.println("Front element: " + queue.front());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("Front element: " + queue.front());

    }

}
