package com.imooc.ioc.test;

/**
 * @author xiaolei hu
 * @date 2018/6/17 13:35
 **/
public class FooTest {
    public int x;
    //final int i;
    int j;

    public void doSomething() {
        //final int i;
        //System.out.println(++j + i);
    }

    public static void main(String[] args) {
        FooTest fooTest = new FooTest();
        float f = 11;
        double m = 3;
        System.out.println(m);
        //System.out.println(x);
    }
}
