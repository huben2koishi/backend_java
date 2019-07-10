package com.huben.c1_3.s9.p3;

/**
 * 注解 javadoc 演示
 *
 * @author huben
 * @version 1.0
 * @since 1.5
 */
public class Demo01Annotation {
    /**
     * 计算两数的和
     *
     * @param a 整数
     * @param b 整数
     * @return 两数的和
     *
     */
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show(){
        System.out.println("show...");
    }

    public void paint(){
        System.out.println("paint...");
    }
}
