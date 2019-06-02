package com.huben.c1_3.s4.p4;

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main(String[] args) {
        // LinkedList 底层为链表结构 增删快查询慢

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        System.out.println(linkedList); // [a, b, c]

        // public void addFirst(E e)    将元素插入列表开头
        linkedList.addFirst("www");
        System.out.println(linkedList); // [www, a, b, c]

        // public void addLast(E e)     将元素插入列表结尾 等效于 add(E e)

        // public void push(E e)        将元素推入列表所表示的栈 等效于 addFirst(E e)

        // public E removeFirst()       移除并返回列表第一个元素
        // public E removeLast()        移除并返回列表最后一个元素
        // public E pop()               从此列表所表示的栈弹出一个元素 等效于 removeFirst()

        // public E getFirst()          返回列表第一个元素
        // public E getLast()           返回列表最后一个元素
    }
}
