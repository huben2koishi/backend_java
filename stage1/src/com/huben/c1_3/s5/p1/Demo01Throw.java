package com.huben.c1_3.s5.p1;

public class Demo01Throw {
    // throw 在指定的方法中抛出指定的异常
    //    必须写在方法内部
    //      创建的是 运行时异常 时可不处理, 交给 JVA
    //      创建的是 编译异常 时, 必须处理这个异常(throws 或 try/catch)

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println(getElement(arr, 1));
        System.out.println(getElement(arr, -10));
    }

    private static int getElement(int[] arr, int index) {

        if (arr == null) {
            throw new NullPointerException("数组为空");
        }

        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }

        return arr[index];
    }
}
