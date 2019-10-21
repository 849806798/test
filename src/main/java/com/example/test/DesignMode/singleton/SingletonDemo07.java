package com.example.test.DesignMode.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonDemo07 implements Serializable{
    public static SingletonDemo07 instance=new SingletonDemo07();

    private SingletonDemo07(){

    }

    public static SingletonDemo07 getInstance(){
        return instance;
    }

    //反序列时，如果定义了readResolve（）则直接返回此方法指定的对象，而不需要单独创建对象。
    //解释详情http://blog.csdn.net/huangbiao86/article/details/6896565
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
