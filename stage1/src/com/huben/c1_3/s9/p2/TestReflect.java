package com.huben.c1_3.s9.p2;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestReflect {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        ClassLoader loader = TestReflect.class.getClassLoader();
        InputStream stream = loader.getResourceAsStream("com/huben/c1_3/s9/p2/setting.properties");
        properties.load(stream);

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class c = Class.forName(className);
        Constructor constructor = c.getConstructor();
        Object o = constructor.newInstance();

        System.out.println(o);

        Method method = c.getMethod(methodName, String.class);
        method.invoke(o, "meats");

    }
}
