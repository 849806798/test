package com.example.test.code.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: fgw
 * @Created: 2020/10/18 20:39
 */
public class Main4 {

    public static void main(String[] args) throws IOException {
       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str=br.readLine())!=null){
            Long  s = Long.parseLong(str);
            StringBuffer sb = new StringBuffer();
            while (s!=1){
                for (int i =2;i<=s;i++){
                    if(s%i==0){
                        sb.append(i).append(" ");
                        s=s/i;
                        continue;
                    }

                }
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb);
        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        while ((str = br.readLine()) != null) {
            int sum = Integer.valueOf(str);
            for (int i = 2; i <= Math.sqrt(sum) ; i++) {
                if (sum % i ==0) {
                    sb.append(i+" ");
                    sum/=i;
                    i--;
                }
            }
            sb.append(sum+" ");
            System.out.println(sb.toString());
        }
    }
}
