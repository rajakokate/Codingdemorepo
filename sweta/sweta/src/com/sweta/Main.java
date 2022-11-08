package com.sweta;

public class Main {

    public static void main(String[] args) {
	// Q: Store a roll number
        int a =19;

        //Q: Store a person's name
        String name ="Sweta Chopdar";

        //Q: Store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;
        int rno4 = 56;
        int rno5 = 43;
        /*
        Syntax:
        datatype[] variable_name = new datatype[size];
         */
        // Store 5 roll numbers:
        int[] rns = new int[5];
        // or directly
        int[] rnos2 ={23, 12, 45, 32, 15};

        int[] ros;// declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)

        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);



    }
}
