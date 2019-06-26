package com.huben.c1_3.s8.p1;

public class Demo01FunctionalInterface {
    public static void main(String[] args) {
        show(new MyFunctionalInterfaceImp());

        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        show(()-> System.out.println("使用Lambda表达式"));
    }

    private static void show(MyFunctionalInterface mfi) {
        mfi.method();
    }
}
