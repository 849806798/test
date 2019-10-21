package com.example.test.Demo;

import java.io.Serializable;

public abstract class Entity<ID> implements Serializable {
    private static final long serialVersionUID = 1L;

    public Entity() {
    }

    public abstract ID getId();

    public abstract void setId(ID var1);
}
