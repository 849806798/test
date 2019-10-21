package com.example.test.DesignMode.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command){
        orders.add(command);
        System.out.println("增加订单： " + command.toString() + " 时间：" + System.currentTimeMillis());
    }

    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单： " + command.toString() + " 时间：" + System.currentTimeMillis());
    }

    public void Notify(){
        for(Command cmd : orders){
            cmd.excuteCommand();
        }
    }
}
