package com.huben.c1_3.s5.p6;

public class Test01Cook {
    public static void main(String[] args) {
        invokeCook(()-> System.out.println("吃饭啦"));
    }

    private static void invokeCook(Cook cook){
        cook.makeFood();
    }
}

interface Cook{
    void makeFood();
}
