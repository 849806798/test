package com.example.test.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class A {
    public static void main(String[] args) {
        while (true) {

            A.getHtmlCode("http://132.232.5.81/");
        }

    }
    public static String getHtmlCode(String path) {
        String html = "", temp = "";
        try {
            URL u = new URL(path);
            URLConnection connection = u.openConnection();
            HttpURLConnection htCon = (HttpURLConnection) connection;
            htCon.addRequestProperty("baiduspider User-Agent", "Mozilla/5.0 (compatible; Baiduspider/2.0; +http://www.baidu.com/search/spider.html)");
            int code = htCon.getResponseCode();
            if (code == HttpURLConnection.HTTP_OK) {
                System.out.println("find the website");
                BufferedReader in=new BufferedReader(new InputStreamReader(htCon.getInputStream()));
                while ((temp = in.readLine()) != null)
                    html = html + " " + temp;
                in.close();
                htCon.disconnect();
            }
            else {
                System.out.println("Can not access the website");
            }
        }
        catch(MalformedURLException e ) {
            System.out.println("Wrong URL");
        }
        catch(IOException e) {
            System.out.println("Can not connect");
        }
        return html;
    }
}
