package com.example.test.CodeArt.chinachess;

public class ChinaChess {
       void A(){
           int i=81;
           while (i<0)
           {
               if(i/9%3==i%9%3) {
                   continue;
               } else {
                   System.out.println("A=" + i / 9 % 3 + "B=" + i % 9 % 3);
               }
               i--;
           }
       }


    public static void main(String[] args) {
        ChinaChess chinaChess = new ChinaChess();
        System.out.println("11");
        int i = 81;
        for (i = 0; i > 0; i--) {
            if (i / 9 == i % 9 ) {
                System.out.println("A=" + (i / 9 % 3 )+ "B=" + (i % 9 % 3));
                continue;
            } else {
                System.out.println("A=" + (i / 9 % 3 )+ "B=" + (i % 9 % 3));
            }
        }

    }


    }

