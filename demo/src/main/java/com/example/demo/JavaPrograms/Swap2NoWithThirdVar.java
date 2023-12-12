package com.example.demo.JavaPrograms;

import java.util.Scanner;

public class Swap2NoWithThirdVar {
    /* Swap the 2 numbers using the third variable */
    public static void main(String[] args){
        int x,y,temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value for x and y");
        x = scan.nextInt();
        y = scan.nextInt();
        System.out.println("Before swapping : " + x + " and " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping : " + x + " and " + y);
    }
}
