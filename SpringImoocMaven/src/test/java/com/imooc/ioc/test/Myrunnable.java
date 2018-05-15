package com.imooc.ioc.test;

public class Myrunnable implements Runnable {
    @Override
    public void run() {
        go();
    }

    public void go() {
        try {
            // 这里时间上的设置可能有些问题，时间设置的太短了，
            // 如果此时操作系统刚好去读磁盘驱动器而花了 2 秒的时间，这个时候执行哪个线程可就不一定了
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doMore();
    }

    public void doMore() {
        System.out.println("top o' the stack");
    }
}
