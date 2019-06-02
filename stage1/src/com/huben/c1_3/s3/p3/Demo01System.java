package com.huben.c1_3.s3.p3;

import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {

        // System.currentTimeMillis() 获取当前毫秒值, 通常用于测试程序运行时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end-start);

        // arraycopy() 复制数组
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }
}
