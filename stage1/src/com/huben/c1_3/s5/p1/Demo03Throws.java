package com.huben.c1_3.s5.p1;

import java.io.FileNotFoundException;

public class Demo03Throws {
    // throws 异常处理的第一种方式, 抛出异常, 让调用它的方法处理

    public static void main(String[] args) throws FileNotFoundException {
        readFile("C:\\a.txt");
    }

    private static void readFile(String fileName) throws FileNotFoundException {
        if (!"C:\\a.txt".equals(fileName)) {
            throw new FileNotFoundException("文件路径不对");
        }
        System.out.println("读取成功");
    }
}
