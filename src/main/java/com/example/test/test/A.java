package com.example.test.test;

public class A {
    public static void main(String[] args) {

        String str = "123\n1123";
        String[]  strs=str.split("\n");

        System.out.println(strs[strs.length-1].toString());


    }
}
