package com.example.demo.javaPrograms.interview;

import java.util.Scanner;

public class CheckVowels {
    //Program to check a vowel in a string
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String s = scan.next();
        boolean result = s.toLowerCase().matches(".*[aeiou].*");
        System.out.println(result);
    }
}
