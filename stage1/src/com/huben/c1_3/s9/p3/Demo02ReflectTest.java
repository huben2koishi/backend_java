package com.huben.c1_3.s9.p3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@Properties(className = "com.huben.c1_3.p9.p3.Person",methodName = "eat")
public class Demo02ReflectTest {
    public static void main(String[] args) throws Exception{
        Class<Demo02ReflectTest> testClass = Demo02ReflectTest.class;
        Properties annotation = testClass.getAnnotation(Properties.class);

        String className = annotation.className();
        String methodName = annotation.methodName();

        Class c = Class.forName(className);
        Constructor constructor = c.getConstructor(String.class,int.class);
        Object o = constructor.newInstance("Mike",21);

        System.out.println(o);

        Method method = c.getMethod(methodName, String.class);
        method.invoke(o, "meats");
    }
}
