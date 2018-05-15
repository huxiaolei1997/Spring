package com.imooc.ioc.test;

public class TestBox {
    Integer i = 3;
    int j;

    //Double d = j;
    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
        int one = 20456654;
        double two = 100567890.248907;
        String s = String.format("The rank is %,d out of %,.2f", one, two);
        System.out.println(s);
    }

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}
