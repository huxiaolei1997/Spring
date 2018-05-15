package com.imooc.ioc.test;

public class Foo {
    static int x;
    //final int x2;
    static final int x3 = 12;
    static final int x4 = 12;
    int x5 = 12;

    public void go() {
        System.out.println(x);
    }

    public void go2() {
        System.out.println(x);
    }
    //pub

    public void go3(final int x4) {
        System.out.println(x4);
    }

    public static void go4(final int x) {
        System.out.println(x);
    }
}
