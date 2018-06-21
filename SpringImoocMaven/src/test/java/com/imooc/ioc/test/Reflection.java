package com.imooc.ioc.test;

import java.lang.reflect.Method;

/**
 * @author xiaolei hu
 * @date 2018/6/19 12:56
 **/
public class Reflection {
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i].toString());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println(e);
        }
    }
}
