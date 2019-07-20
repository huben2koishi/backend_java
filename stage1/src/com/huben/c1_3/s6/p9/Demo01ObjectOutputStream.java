package com.huben.c1_3.s6.p9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stage1/src/com/huben/c1_3/s6/p9/servlet.demo.txt"));

        Person p = new Person("小明",18);

        oos.writeObject(p);

        oos.close();
    }
}
