package com.huben.c1_3.s9.p3;

public class Calculator {
    @check
    public void add() {
        System.out.println("1+0 = " + (1 + 0));
    }

    @check
    public void sub() {
        System.out.println("1-0 = " + (1 - 0));
    }

    @check
    public void mul() {
        System.out.println("1*0 = " + (1 * 0));
    }

    @check
    public void div() {
        System.out.println("1/0 = " + (1 / 0));
    }
}
