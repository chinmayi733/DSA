package org.example;


public class Main {
    public static void main(String[] args) {
        Node head= new Node(9);
        insertTail(4,head);
        insertTail(5,head);
        insertTail(6,head);
        head= insertHead(1,head);
        deleteTail(head);
        head=deleteHead(head);
        deleteByposition(head,2);
        head=insertByPosition(head,1,90);

        //traversal
        Node temp =head;
        int count=0;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
            count++;
        }
        System.out.println("count is "+ count);
    }

    private static void deleteTail(Node head) {
        Node temp=head;
        while(temp.next.next!=null)
        {
          //System.out.println("tranevrsing till second last node");
          temp=temp.next;
        }
        temp.next=null;
    }

    private static Node deleteHead(Node head) {
        Node temp=head;
        head=head.next;
        return head;
    }


    public static void insertTail(int val,Node head)
    {
        if(head!=null)
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new Node(val,null);
        }
        else
        {
            head=new Node(val,null);
        }
    }

    public static Node insertHead(int val,Node head)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public  static void deleteByposition(Node head,int position)
    {
        if(position==1)
        {
            head=deleteHead(head);
            return;
        }
        Node temp=head;
        Node prev=null;
        int count=0;
        while(temp!=null)
        {
            count++;
            if(count==position ) {

                if(temp.next!=null)
                {
                    prev.next= temp.next;
                }
                else
                {
                    deleteTail(head);
                }

                break;
            }
            prev=temp;
            temp=temp.next;
        }
        if(count>position)
        {
            return;
        }
    }

    public static Node insertByPosition(Node head, int position, int val) {
        Node newNode = new Node(val);
        if (position == 1) {
            head=insertHead(val, head);
            return head;
        }
        Node temp = head;
        Node prev = null;
        int count = 0;
        while (temp != null ) {
            count++;
            if(count == position) {
                if (temp.next != null) {
                    newNode.next = temp.next;
                    prev.next = newNode;
                    break;
                }
                else {
                        insertTail(val, head);
                        break;
                    }
                }
            prev=temp;
            temp = temp.next;
            }

        return head;
        }
    }
