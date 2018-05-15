package com.imooc.ioc.test;

public class SingleTon {
    private static SingleTon singleTon = new SingleTon();

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        return singleTon;
    }
}
