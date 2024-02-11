package com.example.demo.javaPrograms.interview;

import java.util.ArrayList;

public class FibonacciSeries {
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static void main(String[] args){
        fibonacciSeries(10);
    }

    private static void fibonacciSeries(int count){
       int a=0,b=1,c=1;
       ArrayList<Integer> fiboList = new ArrayList<Integer>();
       for(int i=0; i< count; i++){
           fiboList.add(a);
           a=b;
           b=c;
           c=a+b;
       }
       System.out.println(fiboList.toString());
    }
}
