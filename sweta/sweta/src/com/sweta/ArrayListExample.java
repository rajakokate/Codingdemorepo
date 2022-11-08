package com.sweta;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

 /*       list.add(23);
        list.add(243);
        list.add(2356);
        list.add(30);
        list.add(25);
        list.add(956);
        list.add(85);
        list.add(50);
        list.add(242);
        list.add(53);
        list.add(973);
        list.add(100);

//        System.out.println(list.contains(25)); // will return 'true'
        System.out.println(list);
        list.set(0,60);

        list.remove(2);
        System.out.println(list);

  */

        //input
        for(int i = 0;i < 5;i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i = 0; i < 5;i++){
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
        }

    }
}
