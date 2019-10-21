package com.example.test.CodeArt.cpuart;

import static java.lang.Thread.sleep;

public class Cpuart {
    public static void main(String[] args) throws InterruptedException {

       int i=0;
        while (true){
            for (i=0;i<960000000;i++)
            {
                sleep(1000);

                System.out.println(i);
            }
        }

    }
}
