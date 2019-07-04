package com.huben.c1_3.s8.p3;

public class Demo04Man extends Human {
    @Override
    public void sayHi() {
        System.out.println("hi, 我是 man");
    }

    public void greeting(Greetable greetable){
        greetable.greet();
    }

    public void show(){
//        greeting(()->{
////            Human h = new Human();
////            h.sayHi();
//            super.sayHi();
//        });
        greeting(super::sayHi);
    }

    public static void main(String[] args) {
        Demo04Man m = new Demo04Man();
        m.show();
    }
}
