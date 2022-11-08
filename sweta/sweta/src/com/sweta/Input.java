package com.sweta;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //arr of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 255;
        arr[3] = 545;
        arr[4] = 2;
        //[23,45,255,545,2]
        System.out.println(arr[3]);

        // input using for loops
        //Process:
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

    /* Process 2:   for(int i = 0; i < arr.length; i++){
                          System.out.println( arr[i] + " ");
                      }

    Process 3:     for(int num : arr){ // for every element in array, print the element
                        System.out.println(num + " ");// here num represents element of the array
                     }

     */

        //System.out.println(arr[5]); // index out of bound error


            // Array of objects
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Sweta";
        System.out.println(Arrays.toString(str));
    }
}
