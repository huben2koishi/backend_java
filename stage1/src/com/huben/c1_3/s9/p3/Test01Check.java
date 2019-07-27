package com.huben.c1_3.s9.p3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class Test01Check {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();

        Class aClass = calculator.getClass();
        Method[] methods = aClass.getMethods();

        int count =0;
        BufferedWriter writer = new BufferedWriter(new FileWriter("stage1/src/com/huben/c1_3/p9/p3/bug.txt"));

        for (Method method : methods) {
            if (method.isAnnotationPresent(check.class)) {
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    count++;
                    writer.write(method.getName()+" 方法有异常");
                    writer.write("\n异常的名称: "+e.getCause().getClass().getSimpleName());
                    writer.write("\n异常的原因: "+e.getCause().getMessage());
                    writer.write("\n=====================\n");
                }
            }
        }
        writer.write("\n本次测试共出现"+count+"处异常");
        writer.close();
    }
}
