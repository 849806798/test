package com.example.test.DesignMode.command;

public class BakeMuttonCommand extends Command {

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();
    }

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }
}

