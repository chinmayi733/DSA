package org.example.Arrays;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        int marks[] = {10, 20, 30, 40, 50};

        System.out.println("Enter what is to be searched");
        Scanner s = new Scanner(System.in);
        int find=s.nextInt();
        boolean flag=false;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==find)
            {
                System.out.println("Found at index "+i);
                flag=true;
                break;
            }
        }

        if(!flag==true)
        {
            System.out.println("Not Found");
        }
    }
}
