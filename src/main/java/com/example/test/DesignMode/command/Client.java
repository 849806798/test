package com.example.test.DesignMode.command;

public class Client {

    public static void main(String[] args) {
        Barbecuer boy=new Barbecuer();
        Command commandA=new BakeChickenWingCommand(boy);
        Command commandB=new BakeMuttonCommand(boy);
        Command commandC=new BakeMuttonCommand(boy);
        Waiter girl=new Waiter();

        girl.setOrder(commandA);
        girl.setOrder(commandB);
        girl.setOrder(commandC);

        girl.Notify();
    }

}
