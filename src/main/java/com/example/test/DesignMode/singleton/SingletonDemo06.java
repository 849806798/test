package com.example.test.DesignMode.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试--懒汉式单例模式（如何防止反射和反序列化漏洞）
 * @author Administrator
 *
 */
public class SingletonDemo06 implements Serializable {

    //类加载时，不初始化这个对象（延时加载，真正用的时候再加载）
    public static SingletonDemo06 instance;//类初始化时，立即加载这个对象

    //私有构造器
    private SingletonDemo06(){
        if(instance != null){
            throw new RuntimeException();
        }
    }
    //方法同步，调用效率低！
    public static  synchronized SingletonDemo06 getInstance(){
        if(instance == null){
            instance = new SingletonDemo06();
        }
        return instance;
    }

    //反序列时，如果定义了readResolve（）则直接返回此方法指定的对象，而不需要单独创建对象。
    //解释详情http://blog.csdn.net/huangbiao86/article/details/6896565
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }
}
