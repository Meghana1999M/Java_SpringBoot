package com.example.demo.javaPrograms.javaBasicPrograms;

import java.util.Scanner;

public class FindLargerNumber {
    public static void main(String[] args){
        int x,y,z;
        System.out.println("Enter the 3 numbers ");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        if(x>y && x>z){
            System.out.println("The largest number is : " + x);
        } else if( y>x && y> z) {
            System.out.println("The largest number is : " + y);
        } else {
            System.out.println("The largest number is : " + z);
        }
    }
}
