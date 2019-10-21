package com.example.test.DesignMode.singleton;


/**
 * 测试枚举式实现单例模式（没有延时操作）
 * 并且可以天然的防止反射和反序列化漏洞
 * @author Administrator
 *
 */
public enum SingletonDemo05 {

    //这个枚举元素，本身就是一个单例模式
    INSTANCE;

    //添加自己需要的操作
    public void singletonOperation() {
    }

}