package com.huben.c1_3.s4.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        /*
        Collection 单列集合
            List 有序集合, 允许存储重复元素, 有索引
                Vector
                ArrayList
                LinkedList
            Set 不允许存储重复元素, 无索引
                TreeSet 无序集合
                HashSet 无序集合
                    LinkedHashSet 有序集合
         */

        Collection<String> collection = new ArrayList<>();
        boolean b1 = collection.add("hello");
        System.out.println("b1: " + b1); // b1: true
        System.out.println(collection); // [hello]

        // public boolean add(E e)      添加元素至当前集合
        collection.add("world");
        collection.add("java");
        collection.add("sql");
        System.out.println(collection); // [hello, world, java, sql]

        // public boolean remove(E e)   从当前集合中删除给定的对象
        boolean b2 = collection.remove("sql");
        System.out.println("b2: " + b2); // b2: true
        boolean b3 = collection.remove("xxx");
        System.out.println("b3: " + b3); // b3: false
        System.out.println(collection); // [hello, world, java]

        // public boolean contains(E e) 检测当前集合是否包含给定的对象
        boolean b4 = collection.contains("java");
        System.out.println("b4: " + b4); // b4: true
        boolean b5 = collection.contains("sql");
        System.out.println("b5: " + b5); // b5: false

        // public boolean isEmpty()     判断当前集合是否为空
        boolean b6 = collection.isEmpty();
        System.out.println("b6: " + b6); // b6: false

        // public int size()            返回集合中元素的个数
        int size = collection.size();
        System.out.println("size: "+size); // size: 3

        // public Object[] toArray()    把集合中元素存储到数组中
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array)); // [hello, world, java]

        // public void clear()          清空集合所有元素
        collection.clear();
        System.out.println(collection); // []

    }
}
