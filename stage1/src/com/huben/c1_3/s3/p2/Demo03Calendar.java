package com.huben.c1_3.s3.p2;

import java.util.Calendar;
import java.util.Date;

public class Demo03Calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

        // get(int field) 获取指定日历字段
        int i = calendar.get(Calendar.YEAR);
        System.out.println(i);

        // set(int field, int value) 设置指定日历字段
        calendar.set(Calendar.MONTH,6);

        // add(int field, int amount) 给指定日历字段增加/减少指定值
        calendar.add(Calendar.DATE,10);

        // getTime() 返回 Date 对象
        Date date = calendar.getTime();
    }
}
