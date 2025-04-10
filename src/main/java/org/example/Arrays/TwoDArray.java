package org.example.Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        int rows= s.nextInt();
        int columns = s.nextInt();

        int[][] arr = new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.println("Enter the element at "+i+" "+j);
                arr[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Enter the element to be searched");
        int find = s.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(find==arr[i][j])
                {
                    System.out.println("Found at "+i+" "+j);
                    break;
                }
            }
        }

    }
}
