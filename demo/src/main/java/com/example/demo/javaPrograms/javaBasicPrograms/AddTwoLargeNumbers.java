package com.example.demo.javaPrograms.javaBasicPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class AddTwoLargeNumbers {
    public static void main(String[] args){
        String number1, number2;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the 1st large number");
        number1 = scan.next();
        System.out.println("Enter the 2nd large number");
        number2 = scan.next();
        BigInteger num1 = new BigInteger(number1);
        BigInteger num2 = new BigInteger(number2);
        BigInteger sum;
        sum = num1.add(num2);
        System.out.println("The sum of large number is : " + sum);
    }
}
