package org.example.Arrays;

public class BubbleSort {
        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};

            //algo
            //find maximum take it at the last by adjacent swaps
            //Time complexity O(n^2)
            //Best case O(n)
            for(int i=arr.length-1;i>=1;i--)
            {
                for(int j=0;j<i;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int t=arr[j];
                        arr[j]=arr[i];
                        arr[i]=t;
                    }
                }
            }


            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }


