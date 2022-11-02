package com.sweta;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//    String fruit = in.next();

  /*  String a ="Sweta";
    String b="Sweta";
    System.out.println( a==b );
    */
 /*   if(fruit.equals("mango")){
        System.out.println("King of fruit");
    }
    if(fruit.equals("apple")){
        System.out.println("A sweet Red fruit");
    }

  */
        // Q: Fruit
  /*      switch(fruit){
            case "Mango":
                System.out.println("King of the fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Smallest fruit");
                break;
            default:
                System.out.println("PLease enter a valid fruit");

        }

   */
        // If break is not given it will check next line

        /*
        switch (fruit){
        case "Mango" ->System.out.println("King of the fruits");
        case "Apple" ->System.out.println("A sweet red fruit");
        case "Orange" -> System.out.println("Round fruit");
        case "Grapes"->System.out.println("Smallest fruit");
        default ->System.out.println("PLease enter a valid fruit");
        } */
        int day = in.nextInt();
 /*      switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
*/

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid");
        }

  /*
        switch (day) {
            case 1,2,3,4,5 ->  System.out.println("Weekday");
            case 6,7 ->  System.out.println("Weekend");
            }
   */

    }
}
