package com.imooc.ioc.annotation.javabased;

public class MyDriverManager {
    public MyDriverManager(String url, String user_name, String password) {
        System.out.println("url: " + url);
        System.out.println("userName: " + user_name);
        System.out.println("password: " + password);
    }
}
