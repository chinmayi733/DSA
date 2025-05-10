package org.example.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high)
        {
            int partionkey = partition(arr,low,high);
            quickSort(arr,low,partionkey-1);
            quickSort(arr,partionkey+1,high);

        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;// Index of smaller element

       while(i<j)
       {
           while(arr[i]<=pivot && i<=high-1)
           {
               i++;
           }

          while(arr[j]>pivot && j>=low+1)
          {
              j--;
          }

          if(i<j)
          {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
          }
       }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
