package org.example.Arrays;

public class MergeSort {

    public void mergeSort(int arr[],int low,int high)
    {
        if(low==high)
        {
            return;
        }

        int mid= (low+high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        mergeArray(arr,low,mid,high);
    }

    private void mergeArray(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i=0;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<arr[right])
            {
                temp[i]=arr[left];
                left++;
                i++;
            }
            else if(arr[left]>arr[right]){
                temp[i]=arr[right];
                right++;
                i++;
            }
            else if(arr[left]==arr[right])
            {
                temp[i]=arr[left];
                left++;
                i++;
            }
        }

        while(left<=mid)
        {
            temp[i]=arr[left];
            left++;
            i++;
        }
        while(right<=high)
        {
            temp[i]=arr[right];
            right++;
            i++;
        }

        for(int j=0;j<temp.length;j++)
        {
            arr[low+j]=temp[j];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
