package com.example.demo.javaPrograms.interview;

import java.util.Arrays;
import java.util.List;

public class OddNumbers {
    //find the old numbers in a list of integers
    public static void main(String[] args){
        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        isOdd(numList);
        isOddNo(numList);
    }
    private static void isOdd(List<Integer> numList){
        for(int num : numList){
            if(num%2 != 0){
                System.out.println(num);
            }
        }
    }

    private static boolean isOddNo(List<Integer> n){
        return n.parallelStream()
                .anyMatch(x-> x%2 !=0);
    }
}
