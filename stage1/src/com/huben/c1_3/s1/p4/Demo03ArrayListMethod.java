package com.huben.c1_3.s1.p4;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        // public boolean add(E e) 向集合添加元素
        boolean isSucceed = list.add("hello");
        System.out.println(list);
        System.out.println("添加是否成功 " + isSucceed);

        list.add("world");
        list.add("Java");
        list.add("servlet.demo");

        // public E get(int index) 从集合获取元素, 参数为索引
        String name = list.get(2);
        System.out.println("索引为2的元素为: " + name);

        // public E remove(int index) 从集合删除元素, 参数为索引, 返回被删除的元素
        String removed = list.remove(3);
        System.out.println("被删除的元素为:"+removed);
        System.out.println(list);

        // public int size() 获取集合元素个数
        System.out.println("集合的长度为: "+list.size());
    }
}
