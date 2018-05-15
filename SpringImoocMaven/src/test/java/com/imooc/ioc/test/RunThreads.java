package com.imooc.ioc.test;

public class RunThreads implements Runnable {
    public static void main(String[] args) {
        RunThreads runnable1 = new RunThreads();
        Thread alpha = new Thread(runnable1);
        Thread beta = new Thread(runnable1);
        // 给线程设置name
        alpha.setName("Alpha Thread");
        beta.setName("Beta Thread");
        alpha.start();
        beta.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running");
        }
    }
}
