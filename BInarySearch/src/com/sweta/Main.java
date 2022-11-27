package com.sweta;

// Ceiling of a Number
// Ceiling means Smallest element in array greater or = target

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 9, 14, 16, 18};
        int target = 15;        //Ans:- Index number of 14 = 4
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the index of smalled no >= target
    static int ceiling(int[] arr,int target){

        //but what if the target is greater than the greatest number in the array
        if(target > arr.length - 1){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle element
            //        int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of integer
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                //ans found
                return mid;
            }
        }
        return start;
    }
}
