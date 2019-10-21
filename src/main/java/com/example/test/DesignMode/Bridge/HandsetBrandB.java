package com.example.test.DesignMode.Bridge;

public class HandsetBrandB extends HandsetBrand {

    @Override
    public void run() {
        handsetSoft.run();
    }
}
