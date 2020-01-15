package com.example.test.DesignMode.iterator;

import java.util.Iterator;

/**
 * @author: fgw
 * @Created: 2020/1/15 15:37
 */
public class LunchIterator implements Iterator<MenuItem>{

    private MenuItem[] menuItems = null;
    private int position = 0;
    private int index;

    public LunchIterator(MenuItem[] menuItems, int index) {
        this.menuItems = menuItems;
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        if(menuItems == null)
            return false;
        return position < this.index;
    }

    @Override
    public MenuItem next() {
        MenuItem munuItem = menuItems[position++];
        return munuItem;
    }

    @Override
    public void remove() {
    }
}
