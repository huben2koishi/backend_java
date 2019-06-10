package com.huben.c1_3.s5.p5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new MyRunnable());
        service.submit(new MyRunnable());
        service.submit(new MyRunnable());
    }
}
