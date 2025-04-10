package org.example.Arrays;

public class InsertionSort {

    public static void main(String[] args) {


        int[] arr = {64, 25, 12, 22, 11};

        //pick up each index and place it at a correct place in the array by swapping by looking at the left guy
        //Time complexity O(n^2)
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int t=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=t;
                j--;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
