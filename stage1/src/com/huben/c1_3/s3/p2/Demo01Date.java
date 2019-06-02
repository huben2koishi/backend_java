package com.huben.c1_3.s3.p2;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        // 无参构造, 获取当前时间日期
        Date date1 = new Date();
        System.out.println(date1);

        // 根据给定的毫秒数创建 Date
        Date date2 = new Date(1556904122891L);
        System.out.println(date2);

        // Date.getTime() 获取 Date 对象对应的毫秒数, 相当于 System.currentTimeMillis()
        long time = date1.getTime();
        System.out.println(time);
    }

}
