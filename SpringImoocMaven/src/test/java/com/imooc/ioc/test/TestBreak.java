package com.imooc.ioc.test;

/**
 * @author xiaolei hu
 * @date 2018/6/21 21:33
 **/
public class TestBreak {
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println(1);
                //break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                //break;
            case 4:
                System.out.println(4);
            default:
                System.out.println("default");
        }
    }
}
