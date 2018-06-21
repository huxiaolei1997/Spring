package com.imooc.ioc.test;

/**
 * @author xiaolei hu
 * @date 2018/6/19 10:41
 **/
public class TestInterfaceMethod {
    public static void main(String[] args) {
        String a = "llo";
        String str1 = "hello";
        String str2 = "he" + a;
        System.out.println(str1 == str2);
        int i = 0;
        i = i++;
        System.out.println(i);
        int b = 0;
        b = ++b;
        System.out.println(b);
        int c = 0;
        c = c + 1;
        System.out.println(c);
        String[] s = new String[10];
        System.out.println(s[9]);
    }
}
