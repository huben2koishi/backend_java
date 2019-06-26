package com.huben.c1_3.s8.p1;

import java.util.function.Consumer;

public class Test02Consumer {
    public static void main(String[] args) {
        String[] arr = {"小明,男", "小红,女", "小刚,男"};


        for (String people : arr) {
            consumeString(people,
                    p -> System.out.print("姓名: "+p.split(",")[0]+", "),
                    p -> System.out.println("性别: "+p.split(",")[1]));
        }
    }

    private static void consumeString(String str, Consumer<String> name, Consumer<String> gender) {
        name.andThen(gender).accept(str);
    }

}
