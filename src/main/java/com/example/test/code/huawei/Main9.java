package com.example.test.code.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: fgw
 * @Created: 2020/10/18 23:10
 */
public class Main9 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        while ((str=reader.readLine())!=null){
            String[] strings = str.split(" ");
            int a= Integer.valueOf(strings[0]);
            int result;
            for (int i=0;i<strings.length;i++){
                if (a+Integer.valueOf(strings[i])<Integer.valueOf(strings[strings.length-1])){
                    a=a+Integer.valueOf(strings[i]);
                }else if(a+Integer.valueOf(strings[i])==Integer.valueOf(strings[strings.length-1])){
                    System.out.println(strings[i]);
                }
                continue;
            }
        }

    }
}
