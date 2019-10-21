package com.example.test.DesignMode.Bridge;

public class HandsetBrandA extends HandsetBrand {

    @Override
    public void run() {
        handsetSoft.run();
    }
}
