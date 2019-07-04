package com.huben.c1_3.s8.p3;

public class Demo05Hus {
    private void buyHouse(){
        System.out.println("买房子");
    }

    public void shopping(Richable richable){
        richable.buy();
    }

    public void happy(){
        shopping(this::buyHouse);
    }

    public static void main(String[] args) {
        Demo05Hus hus = new Demo05Hus();
        hus.happy();
    }
}
