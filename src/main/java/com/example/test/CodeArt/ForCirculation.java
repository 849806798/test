package com.example.test.CodeArt;

public class ForCirculation {

    int[]  DivArray(int[] pArray){
        for (int i=pArray.length-1;i>=0;i--){
            pArray[i]/=pArray[0];
        }
        return pArray;
    }

    public static void main(String[] args) {
        ForCirculation forCirculation=new ForCirculation();
        int[] a={2,2,3,4,5};
        System.out.println(forCirculation.DivArray(a).hashCode());
    }
}
