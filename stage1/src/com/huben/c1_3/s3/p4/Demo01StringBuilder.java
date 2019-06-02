package com.huben.c1_3.s3.p4;

public class Demo01StringBuilder {
    public static void main(String[] args) {

        // 构造一个空的 字符串生成器, 初始容量为16个字符
        StringBuilder b1 = new StringBuilder();
        System.out.println("b1: "+b1);

        // 构造一个字符串生成器, 并初始化为指定内容
        StringBuilder b2 = new StringBuilder("hello");
        System.out.println("b2: "+b2);

        // append() 往 StringBuilder中添加数据
        b2.append("world");
        System.out.println("b2: "+b2);


    }
}
