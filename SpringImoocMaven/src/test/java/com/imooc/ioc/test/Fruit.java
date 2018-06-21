package com.imooc.ioc.test;

import java.util.Arrays;

/**
 * @author xiaolei hu
 * @date 2018/6/17 17:01
 **/
public class Fruit {
    public static void main(String[] args) {
        String str = "用户1|用户2|用户3|用户4";
        String[] strs = str.split("\\|");
        System.out.println(Arrays.toString(strs));
        String str1 = "ABCDEFG";
        System.out.println(str1.substring(2, 5));
    }
}
