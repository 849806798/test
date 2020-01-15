package com.example.test.DesignMode.iterator;

import java.util.Iterator;
/**
 * @author: fgw
 * @Created: 2020/1/15 15:37
 */
public class LuchMenu implements Menu {

    private MenuItem[] menuItems = new MenuItem[30];
    private int position = 0;

    public void addMenuItem(MenuItem menuItem){
        menuItems[position++] = menuItem;
    }

    public void remove(MenuItem menuItem){
        int i = 0;
        while(menuItems[i] != menuItem) ++i;
    }

    public Iterator<MenuItem> createIterator() {
        return  new LunchIterator(menuItems, position);
    }
}
