package com.example.test.code.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: fgw
 * @Created: 2020/10/19 0:35
 */
public class Main10 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str =reader.readLine();
        String str1 =reader.readLine();
        int str2 =reader.read();
        for (int i=0;i<str.length();i++) {
            for (int j=str.length();j>0;j--) {
                int l=0;
                for (int k = 0; k < str.length() - 1; k++) {
                    l= str.charAt(i+k)-str1.charAt(i+k);
                }
                if(l<str2){
                    System.out.println(j);
                    break;
                }
              }
            }

    }
}
