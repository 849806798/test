package com.example.test.arithmetic.bakedProblem;

import lombok.Data;

@Data
public class Backe {

    private int size;

    private int local;

    Backe(int size,int local){
        this.size=size;
        this.local=local;
    }
}
