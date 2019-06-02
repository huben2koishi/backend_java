package com.huben.c1_3.s3.p2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02DateFormat {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();

        // format() 将 Date 格式化为字符串
        String time1 = df.format(date);
        System.out.println(time1);

        // parse() 将字符串解析为 Date
        String time2 = "2019-05-04 01:35:15";
        Date date2 = null;
        try {
            date2 = df.parse(time2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date2);

    }
}
