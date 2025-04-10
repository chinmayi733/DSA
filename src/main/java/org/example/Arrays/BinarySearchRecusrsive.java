package org.example.Arrays;

public class BinarySearchRecusrsive {

    public static void main(String[] args) {
     int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
     int target = 9;
     System.out.print(BinarySearch(0,arr.length-1,target,arr));
    }

    public static int BinarySearch(int start, int end,int target,int[] arr) {
        if (start <= end) {
            int mid = (start + end )/ 2;
            //System.out.println("mid is " + arr[mid]);
            if (target == arr[mid]) {
                //System.out.println("Found at index " + mid);
                return mid;
            } else if (target < arr[mid]) {
                return BinarySearch(start, mid - 1, target, arr);
            }
            else {
            return BinarySearch(mid + 1, end, target, arr);
        }
    }
        System.out.println("Not Found");
        return -1;
    }
}
