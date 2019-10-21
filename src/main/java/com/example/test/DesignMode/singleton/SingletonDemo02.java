package com.example.test.DesignMode.singleton;


/**
 *
 * 懒汉单例模式
 */
public class SingletonDemo02 {


    public static SingletonDemo02 instance;

    public SingletonDemo02(){}
          //方法同步效率低
    public static synchronized SingletonDemo02 getInstance() {
        if (instance==null){
            instance=new SingletonDemo02();
        }
        return instance;
    }
}
