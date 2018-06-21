package com.imooc.ioc.test;

/**
 * @author xiaolei hu
 * @date 2018/6/20 12:34
 **/
public class Son extends Father {
    public Son() {
        System.out.println("Son");
    }

    public static void main(String[] args) {
        Son son = new Son();
    }
}
