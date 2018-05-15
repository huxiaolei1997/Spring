package com.imooc.ioc.test;

public class Foof {
    final int size = 3;
    final int whuffie;

    Foof() {
        whuffie = 42;
    }

    // 当final变量应用于方法的参数时，这时这个参数的值就不能改变
    void doStuff(final int x) {
        // x = 3; 这样是错误的，不能通过编译
    }

    void doMore() {
        final int z = 7;
    }

    public void test() {
        System.out.println("test1");
    }

    public static void main(String[] args) {
        System.out.println("test");
        //test();
    }
}
