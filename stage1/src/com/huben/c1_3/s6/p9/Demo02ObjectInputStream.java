package com.huben.c1_3.s6.p9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stage1/src/com/huben/c1_3/s6/p9/servlet.demo.txt"));

        Person p;

        p = (Person) ois.readObject();


        System.out.println(p);

        ois.close();
    }
}
