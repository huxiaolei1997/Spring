package com.imooc.ioc.test;

/**
 * @author xiaolei hu
 * @date 2018/6/26 21:22
 **/
public interface InterfaceA {

    default void test() {
        System.out.println("InterfaceA");
    }

    ;
}
