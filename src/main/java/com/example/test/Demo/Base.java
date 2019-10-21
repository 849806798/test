package com.example.test.Demo;

public class Base {
    public  String getCacheName(String token){
        return String.format("token_key_%s",token);
    }
}
