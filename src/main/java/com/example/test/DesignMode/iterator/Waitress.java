package com.example.test.DesignMode.iterator;

import java.util.Iterator;

/**
 * @author: fgw
 * @Created: 2020/1/15 15:39
 */
public class Waitress {

    private Iterator<MenuItem> iterator = null;
    private Menu menu = null;

    public Waitress(Menu menu) {
        this.menu = menu;
    }

    public void printMenu() {
        System.out.println("\n菜单：");
        iterator = menu.createIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
