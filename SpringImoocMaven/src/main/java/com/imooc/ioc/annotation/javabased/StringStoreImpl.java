package com.imooc.ioc.annotation.javabased;

public class StringStoreImpl implements Store {

    public void init() {
        System.out.println("This is init.");
    }

    public void destroy() {
        System.out.println("This is destory.");
    }
}
