package com.example.demo.JavaPrograms;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
        float temperature;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        temperature = scan.nextFloat();
        temperature = ((temperature - 32) * 5/9);
        System.out.println("temperature in celsius : " + temperature);
    }
}
