package org.example.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        //algo
        //find minimum and swap
        //Time complexity O(n^2)

        for(int i=0;i<=arr.length-2;i++)
        {
            int mini=arr[i];
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<mini)
                {
                    mini=arr[j];
                    int t=arr[i];
                    arr[j]=t;
                    arr[i]=mini;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
