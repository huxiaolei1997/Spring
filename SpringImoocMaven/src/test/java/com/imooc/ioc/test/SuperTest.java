package com.imooc.ioc.test;

/**
 * @author xiaolei hu
 * @date 2018/6/17 21:57
 **/
public class SuperTest {
    private static final long serialVersionUID = 1L;

    private void test() {
        System.out.println(super.getClass().getName());
    }

    public static void main(String[] args) {
        new SuperTest().test();
        String str = "hello world";
        //str +=  '     a';
        int strlen = str.length();
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {

        }
        //str = 100;
        str = str + 100;
    }
}
