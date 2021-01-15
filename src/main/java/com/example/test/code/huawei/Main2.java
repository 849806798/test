package com.example.test.code.huawei;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.StringReader;

    /**
     * @author: fgw
     * @Created: 2020/10/18 20:18
     */
    public class Main2 {

        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str;
            while ((str = reader.readLine())!=null) {
                StringBuilder sb= new StringBuilder(str);
                while(sb.length()>=8){
                    System.out.println(sb.substring(0,8));
                    sb.delete(0,8);
                }
                if(sb.length()<8 && sb.length()>0){
                    sb.append("00000000");
                    System.out.println(sb.substring(0,8));
                }
            }
        }

    }
