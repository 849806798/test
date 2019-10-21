package com.example.test.DesignMode.command;

public class BakeChickenWingCommand extends Command {


    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void excuteCommand() {
         receiver.bakeChickenWing();
    }


}
