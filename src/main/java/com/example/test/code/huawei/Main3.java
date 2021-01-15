package com.example.test.code.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: fgw
 * @Created: 2020/10/18 20:33
 */
public class Main3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str=br.readLine())!=null){
            System.out.println(Integer.parseInt(str.substring(2),16));
        }
    }
}
