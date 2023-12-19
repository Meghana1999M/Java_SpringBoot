package com.example.demo.javaPrograms.javaBasicPrograms;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args){
        int x, y, z;
        System.out.println("Enter the x and y number");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        z = x+ y;
        System.out.println("The sum of 2 numbers is : " + z);
    }
}
