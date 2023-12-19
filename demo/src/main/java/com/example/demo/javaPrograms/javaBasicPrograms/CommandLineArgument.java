package com.example.demo.javaPrograms.javaBasicPrograms;

import java.util.List;

public class CommandLineArgument {
    public static void main(String[] args){
        List<String> obj = List.of("a", "b", "c");
        for(String t: obj){
            System.out.println(t);
        }
    }
}
