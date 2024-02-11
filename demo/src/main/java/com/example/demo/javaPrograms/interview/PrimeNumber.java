package com.example.demo.javaPrograms.interview;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
    //Prime number
    //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    public static void main(String[] args){
        System.out.println(isPrime(12));
        System.out.println(isPrime(7));
    }
    private static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
