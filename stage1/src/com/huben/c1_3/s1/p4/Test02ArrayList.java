package com.huben.c1_3.s1.p4;

import java.util.ArrayList;

public class Test02ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Mike", 18));
        list.add(new Student("John", 17));
        list.add(new Student("Tom", 12));
        list.add(new Student("Mary", 21));

        for (Student student : list) {
            System.out.println("姓名: "+student.getName()+" 年龄: "+student.getAge());
        }

    }
}
