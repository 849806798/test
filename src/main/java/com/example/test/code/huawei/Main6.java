package com.example.test.code.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: fgw
 * @Created: 2020/10/18 20:57
 */
public class Main6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        line = br.readLine();
        int[] ints = new int[Integer.valueOf(line)];
        while ((line =br.readLine()) !=null){
            int a = line.indexOf(" ");
            int b = line.indexOf(" ", a);
            Integer c = Integer.valueOf(line.substring(0, a));
            Integer d = Integer.valueOf(line.substring(a + 1));
            ints[c] = ints[c]+d;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <ints.length ; i++) {
            if (ints[i]!=0){
                sb.append(i).append(" ").append(ints[i]).append("\n");
            }

        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

}
