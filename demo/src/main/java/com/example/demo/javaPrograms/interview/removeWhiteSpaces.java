package com.example.demo.javaPrograms.interview;

import java.util.Scanner;

public class removeWhiteSpaces {
    //Program to remove the whitespaces in a string
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String name = scan.next();
        char[] nameList = name.toCharArray();
        StringBuilder newName = new StringBuilder();
        for(char single : nameList ){
            if(!Character.isWhitespace(single)){
                newName.append(single);
                continue;
            }
        }
        System.out.println("String without spaces: "+ newName.toString());
    }
}
