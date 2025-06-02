package org.example;

public class StackArray {

    int[] a;

    int top;
    StackArray(int size) {
        a = new int[size];
        top = -1;
    }


    public void push(int v)
    {
        if(top==a.length-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            a[top]=v;
        }
    }

    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("Popped: "+a[top]);
            top--;
        }
    }

    public int top()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return a[top];
        }
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Top element: " + stack.top());
        stack.pop();
        System.out.println("Top element after pop: " + stack.top());
        stack.pop();
        stack.pop(); // This will show underflow
    }


}
