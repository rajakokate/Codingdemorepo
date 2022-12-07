package com.sweta;

// https://leetcode.com/problems/missing-number/
// Amazon Question

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNo(arr));
    }

    public static int missingNo(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
        /*

        while(i < arr.length){
            if(arr[i] < arr.length && arr[i] != arr[i]){
                swap(arr, i, arr[i]);
            } else{
                i++;
            }
        }
         */

        //search for first missing number
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
