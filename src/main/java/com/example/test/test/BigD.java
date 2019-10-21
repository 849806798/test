package com.example.test.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigD {
    public static void main(String[] args) {
        BigDecimal b=new BigDecimal("12.00");
        BigDecimal b1=new BigDecimal("10.11");
        BigDecimal b3=new BigDecimal("100");
        BigDecimal b2=b.subtract(b1).divide(b1,4, RoundingMode.HALF_UP).multiply(b3).setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(b2);
    }
}
