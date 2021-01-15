package com.example.test.code.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: fgw
 * @Created: 2020/10/18 22:27
 */
public class Main8 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str =reader.readLine();
        int sum= Integer.parseInt(str);
        int sum2=0;
        int sum1=0;
        for (int i =0;i<str.length();i++){
            int s=Integer.parseInt(String.valueOf(str.charAt(i)));
            if(i<str.length()-1) {
                if(s>4){
                   sum1 =sum1*10+s;
                   sum1++;
                }else if(s<4){
                    sum1 =sum1*10+s;
                }
                sum2 = sum2 * 10+s;
                if(i>0){
                    sum2=sum2-Integer.parseInt(String.valueOf(str.charAt(i-1)));
                }
            }else {
                if(s>4) {
                    sum1++;
                }
            }
        }
        System.out.println(sum-sum1-sum2+1);
    }
}
