package com.example.test.code.huawei;

import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: fgw
 * @Created: 2020/10/18 21:53
 */
public class Main7 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Boolean[] s= new Boolean[10];
        StringBuilder resul = new StringBuilder();
        for (int i=0;i<str.length();i++ ){
            int a= Integer.parseInt(String.valueOf(str.charAt(i)));
            if(s[a]==null){
                s[a] =true;
                resul.append(a);
            }
        }
        StringBuilder sb= resul.reverse();
        System.out.println(sb.toString());
    }
}
