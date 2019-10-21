package com.example.test.DesignMode.singleton;

/**
 *
 * 饿汉单例模式
 *
 */
public class SingletonDemo01 {


       public static SingletonDemo01 instance=new SingletonDemo01();

       private SingletonDemo01(){

       }

       public static SingletonDemo01 getInstance(){
           return instance;
       }
}
