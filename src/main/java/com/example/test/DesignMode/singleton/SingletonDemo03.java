package com.example.test.DesignMode.singleton;


/**
 *
 * * 双重检测锁实现
 * 特点：这个模型将同步内容下方到if内部，提高执行效率，不必每次获取对象时都进行同步，
 * 只有第一次才同步，创建以后就没必要了。
 *
 * 问题：由于编译器和JVM底层内部模型的原因。偶尔会出问题。不建议使用。
 */
public class SingletonDemo03 {


    private static SingletonDemo03 instance;

    public static SingletonDemo03 getInstance() {
        if (instance == null) {
            SingletonDemo03 sc;
            synchronized (SingletonDemo03.class){
                sc=instance;
                if (sc == null) {
                    synchronized (SingletonDemo03.class){
                        if (sc == null) {
                            sc=new SingletonDemo03();
                        }
                        instance=sc;
                    }
                }
            }
        }
       
       
        return instance;
    }
}
