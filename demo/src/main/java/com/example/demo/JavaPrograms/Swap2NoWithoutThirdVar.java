package com.example.demo.JavaPrograms;

import java.util.Scanner;

public class Swap2NoWithoutThirdVar {
    public static void main(String[] args){
        int x, y;
        System.out.println("Enter the values : ");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        System.out.println("Before swapping the x and y : " + x + " and " + y);
        x = x+y;
        y = x-y;
        y = x+y;
        System.out.println("After swapping x and y : " + x + " and " +y);
    }
}
