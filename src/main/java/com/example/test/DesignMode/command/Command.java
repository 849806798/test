package com.example.test.DesignMode.command;

abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer barbecuer){
        this.receiver=barbecuer;
    }

    public abstract void excuteCommand();
}
