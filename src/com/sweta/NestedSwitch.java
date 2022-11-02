package com.sweta;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int empID=in.nextInt();
        String department= in.next();

        switch(empID){
            case 1:
                System.out.println("Sweta Chopdar");
                break;
            case 2:
                System.out.println("Anchal Prusty");
                break;
            case 3:
                switch (department) { // Unable to run String in Switch
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }
    }
}

