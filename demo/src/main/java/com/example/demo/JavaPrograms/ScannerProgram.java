package com.example.demo.JavaPrograms;

import java.util.Scanner;

public class ScannerProgram {
    public static void main(String[] args){
        int i;
        float f;
        String s;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Integer : ");
        i = scan.nextInt();
        System.out.println("The Entered Integer number is " + i);

        System.out.println("Enter the String : ");
        s = scan.next();
        System.out.println("The Entered String is " + s);

        System.out.println("Enter the float number : ");
        f = scan.nextFloat();
        System.out.println("The Entered Float number is " + f);
    }
}
