package com.huben.c1_3.s1.p6;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student student1 = new Student("Tom", 18);
        Student student2 = new Student("Jack", 21);

        System.out.println("姓名: " + student1.getName()
                + " 年龄: " + student1.getAge()
                + " 学号: " + student1.getId()
                + " 教室: " + Student.room);
        System.out.println("姓名: " + student2.getName()
                + " 年龄: " + student2.getAge()
                + " 学号: " + student2.getId()
                + " 教室: " + Student.room);
    }
}
