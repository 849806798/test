package com.example.test.DesignMode.Bridge;

public class Client {

    public static void main(String[] args) {
        HandsetBrand ab = new HandsetBrandA();

        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandB();

        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

    }
}
