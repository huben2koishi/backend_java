package com.huben.c1_3.s8.p3;

public class Demo02MethodRefObj {
    public static void main(String[] args) {
//        printUpperCase(str -> {
//            MethodRefObj obj= new MethodRefObj();
//            obj.printUpperCaseString(str);
//        });

        MethodRefObj obj = new MethodRefObj();
        printUpperCase(obj::printUpperCaseString);
    }

    private static void printUpperCase(Printable p) {
        p.print("hello");
    }
}
