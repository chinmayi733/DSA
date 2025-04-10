package org.example.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 1;
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            int mid = (i+j)/2;
            if(arr[mid]==target)
            {
                System.out.println("Found at index "+mid);
                break;
            }
            else if(target>arr[mid])
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }

    }
}
