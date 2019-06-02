package com.huben.c1_3.s4.p2;

import java.util.ArrayList;

public class Demo01Generic {
    public static void main(String[] args) {
        // 创建集合对象, 不使用泛型
        // 好处: 不指定泛型, 默认就是 Object 类型, 可以存储任意类型的数据
        // 弊端: 不安全, 容易引发异常
        ArrayList list = new ArrayList();

        list.add("hello");
        list.add(123);

        System.out.println(list);

        for (Object o : list) {
            System.out.println(o);

            try {
                String s = (String) o;
                System.out.println(s.length());
            } catch (ClassCastException ignored) {
            }
        }

        // 创建集合对象, 使用泛型
        // 好处: 避免了类型转换的麻烦, 把运行期异常提升到了编译期

    }
}
