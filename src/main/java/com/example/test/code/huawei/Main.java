package com.example.test.code.huawei;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.util.Scanner;

/**
 * @author: fgw
 * @Created: 2020/10/18 19:36
 */
public class Main {

    /**
     * 7ms
     * 运行时间
     * 9384KB
     */
    /**
     * 25ms
     * 运行时间
     * 10680KB
     */
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        String a= scanner.nextLine();
        String b =scanner.nextLine();
        int j =0;
        for (int i = 0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(0)|| a.charAt(i) == b.charAt(0)-32){
                j++;
            }
        }
        System.out.println(j);
    }
}
