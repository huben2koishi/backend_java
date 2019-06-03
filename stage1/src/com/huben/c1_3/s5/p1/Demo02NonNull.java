package com.huben.c1_3.s5.p1;

import java.util.Objects;

public class Demo02NonNull {
    public static void main(String[] args) {
        method("a");
        method(null);
    }

    private static void method(Object obj) {
//        if (obj == null) {
//            throw new NullPointerException("对象为空");
//        }

//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "对象为空");
    }
}
