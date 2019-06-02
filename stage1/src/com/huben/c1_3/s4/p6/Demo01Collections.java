package com.huben.c1_3.s4.p6;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // public static <T> boolean addAll(Collection<T> c, T...element) 添加元素
        Collections.addAll(list, "abc", "hello", "world");
        System.out.println(list); // [abc, hello, world]

        // public static void shuffle(List<?> list) 打乱
        Collections.shuffle(list);
        System.out.println(list);

        // public static <T> void sort(List<?> list) 默认排序
        Collections.sort(list);
        System.out.println(list); // [abc, hello, world]

        // sort() 排序的元素必需实现 Comparable 接口, 重写 compareTo() 方法

        // public static <T> void sort(List<?> list, Comparator<? super T>) 自定义排序
        list.sort((o1, o2) -> o2.charAt(0) - o1.charAt(0));
        System.out.println(list); // [world, hello, abc]

    }
}
