package com.example.test.finalTest;

import org.hibernate.validator.constraints.EAN;

import java.util.List;

/**
 * @author: fgw
 * @Created: 2020/1/9 10:28
 */
public class useInner {

    public void userInnerClass(DateBean beans){
        DateBean bean = new DateBean("asdf");
        InnerClass innerClass = new InnerClass(){
            void doSomething(){
                beans.name = "aa";
                System.out.printf("bean name is " +  beans.name);
            }
        };
        innerClass.doSomething();
    }

    public static void main(String[] args) {
        useInner useInner = new useInner();
        DateBean bean = new DateBean("asdf");
        useInner.userInnerClass(bean);
    }

}
