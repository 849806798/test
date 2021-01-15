package com.example.test.code.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author: fgw
 * @Created: 2020/10/18 19:50
 */
public class Main1 {

    /**
     * 运行时间：62ms
     * 占用内存：11916k
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            StringBuilder sb = new StringBuilder();
            boolean[] b = new boolean[1001];
            int j = 0;
            for (int i = 0; i < a; i++) {
                b[scanner.nextInt()] = true;
            }
            for (int i = 1; i < 1001; i++) {
                if (b[i]) {
                    sb.append(i).append("\n");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        }
    }
    /*public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            boolean[] stu = new boolean[1001];
            StringBuilder sb = new StringBuilder();
            int n = Integer.valueOf(str);
            for (int i = 0; i < n; i++)
                stu[Integer.valueOf(br.readLine())] = true;
            for (int i = 1; i < 1001; i++) {
                if (stu[i]) {
                    sb.append(i).append("\n");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        }
    }
*/
}
