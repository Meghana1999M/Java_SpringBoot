package com.example.demo.javaPrograms.interview;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = scan.next();
        char[] charName = name.toCharArray();
        StringBuilder tempName = new StringBuilder();
        for(int i= charName.length-1 ;i>=0;i--){
            tempName.append(charName[i]);
        }
        System.out.println("Reversed String" + tempName);
        if(name.equals(tempName.toString())){
            System.out.println("The Name is a Palindrome");
        }else{
            System.out.println("The Name is not a Palindrome");
        }
    }
}
