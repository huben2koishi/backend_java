package com.huben.c1_3.s5.p1;

import java.util.Scanner;

public class Demo05RegisterException {
    private static String[] users = {"张三", "李四", "王二"};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = s.next();

        try {
            checkName(name);
        } catch (RegisterException e) {
            e.printStackTrace();
        }

    }

    private static void checkName(String name) throws RegisterException {
        for (String user : users) {
            if (name.equals(user)) {
                throw new RegisterException("用户名已存在");
            }
        }
        System.out.println("注册成功");
    }
}
