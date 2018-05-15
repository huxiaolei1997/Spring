package com.imooc.ioc.test;

public class TestSingleTon implements Runnable {
    @Override
    public void run() {
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println(singleTon.hashCode());
    }

    public static void main(String[] args) {
        Runnable runnable = new TestSingleTon();
        Thread test = null;
        for (int i = 0; i < 100; i++) {
            test = new Thread(runnable);
            test.start();
        }
    }
}
