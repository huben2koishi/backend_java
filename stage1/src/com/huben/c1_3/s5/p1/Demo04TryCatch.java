package com.huben.c1_3.s5.p1;

import java.io.FileNotFoundException;

public class Demo04TryCatch {
    // try...catch 异常处理的第二种方式, 自己处理异常

    public static void main(String[] args) {
        try {
            readFile("C:\\a.md");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("永远执行");
        }
    }

    private static void readFile(String fileName) throws FileNotFoundException {
        if (!"C:\\a.txt".equals(fileName)) {
            throw new FileNotFoundException("文件路径不对");
        }
        System.out.println("读取成功");
    }
}
