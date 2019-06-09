package com.huben.c1_3.s5.p3;

public class MySynchronizedMethodRunnable implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while(true){
            payTicket();
        }
    }

    public synchronized void payTicket(){
        if(ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + ticket);
            ticket--;
        }
    }
}
