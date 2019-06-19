package com.huben.c1_3.s6.p9;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> people = new ArrayList<>();

        Collections.addAll(people,
                new Person("小明", 13),
                new Person("小红", 15),
                new Person("小刚", 14));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stage1/src/com/huben/c1_3/s6/p9/list.txt"));
        oos.writeObject(people);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stage1/src/com/huben/c1_3/s6/p9/list.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list = (ArrayList<Person>) o;

        for (Person person : list) {
            System.out.println(person);
        }

        oos.close();
        ois.close();

    }
}
