package com.imooc.ioc.test;

/**
 * @author xiaolei hu
 * @date 2018/6/17 18:01
 **/
public class Example {
    String str = new String("hello");
    char[] ch = {'a', 'b'};
    char[] ch3 = {'m'};

    public static void main(String args[]) {
        Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
        ex.Example();
    }

    public void change(String str, char ch2[]) {
        str = "test ok";
        //ch2 = ch3;
        ch2[0] = ch3[0];
        //ch2[0]='c';
    }

    public void Example() {
        System.out.println("I'm a method called " + this.getClass().getName());
    }
}
