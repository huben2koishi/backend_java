package com.huben.c1_3.s4.p4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

        // List 继承 Collection
        // List 允许存储重复的元素, 且存储的元素的带有索引的

        // List 特有的带索引的方法
        // public void add(int index, E e) 向指定索引处添加元素
        list.add(1, "1");
        System.out.println(list);// [a, 1, b, c, a]

        // public E remove(int index) 移除指定索引处的元素
        String removed = list.remove(3);
        System.out.println("被移除的元素是: " + removed); // c
        System.out.println(list); // [a, 1, b, a]

        // public E set(int index, E e) 修改指定索引处的元素
        String set = list.set(2, "1");
        System.out.println("被修改的元素是: " + set); // b
        System.out.println(list); // [a, 1, 1, a]

        // public E get(int index) 获取指定索引处的元素
        String get = list.get(3);
        System.out.println("获取的元素是: " + get); // a

        // List 集合的遍历有3中方法: for循环, 迭代器, 增强 for 循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String s : list) {
            System.out.println(s);
        }

        // 操作索引时要防止数组越界异常
    }
}
