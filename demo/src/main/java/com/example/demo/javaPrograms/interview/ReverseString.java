package com.example.demo.javaPrograms.interview;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name :");
        String s = scan.next();
        char[] name = s.toCharArray();
        StringBuilder reversedName = new StringBuilder();
        for(int i= name.length-1; i>= 0; i--){
            reversedName.append(name[i]);
        }
        System.out.println(reversedName.toString());
    }
}
