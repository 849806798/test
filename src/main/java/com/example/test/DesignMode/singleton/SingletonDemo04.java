package com.example.test.DesignMode.singleton;

/**
 * 测试静态内部类实现单例模式
 * 这种方法：线程安全，调用效率高，可以延时加载
 * @author Administrator
 *
 */
public class SingletonDemo04 {

    public static class SingletonClassInstance{
        private static final SingletonDemo04 instance=new SingletonDemo04();
    }


    public static SingletonDemo04 getInstance(){

        return SingletonClassInstance.instance;
    }

    public SingletonDemo04(){

    }
}
