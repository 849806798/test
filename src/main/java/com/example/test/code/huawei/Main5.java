package com.example.test.code.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: fgw
 * @Created: 2020/10/18 20:57
 */
public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str;

        while ((str= br.readLine())!=null){
            Float f = Float.parseFloat(str);

            System.out.println(Math.round(f));
        }
    }
}
