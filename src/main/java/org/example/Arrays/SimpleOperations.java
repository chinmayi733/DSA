package org.example.Arrays;

import java.util.Scanner;

public class SimpleOperations {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int marks[]= new int[20];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = s.nextInt();

        // Taking input of marks of n students
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the marks of each student");
            marks[i] = s.nextInt();
        }
        // Displaying the marks of n students
        display(marks,n);
        //Inserting
        insert(marks,n);
        n++;
        display(marks,n);
        // Deleting
        delete(marks,n);
        n--;
        display(marks,n);


    }


    public static void insert(int[] marks,int n)
    {
        System.out.println("Enter the position where you want to insert the marks");
        int pos = s.nextInt();
        System.out.println("Enter the marks you want to insert");
        int value= s.nextInt();

        if(pos>n)
            marks[pos]=value;
        else
        {
            for(int i=n-1;i>=pos-1;i--)
            {
                marks[i+1]=marks[i];
            }
        }

        marks[pos-1]=value;
    }

    public static void display(int[] marks,int n)
    {
        System.out.println("The marks of each student are");
        for(int i=0;i<n;i++)
        {
            System.out.println(marks[i]);
        }
    }

    public static void delete(int[] marks,int n)
    {
        System.out.println("Enter the position where you want to delete the marks");
        int pos = s.nextInt();

        for(int i=pos-1;i<n;i++)
        {
            marks[i]=marks[i+1];
        }
    }
}
