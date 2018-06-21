package com.imooc.ioc.test;

/**
 * @author xiaolei hu
 * @date 2018/6/16 22:05
 **/
public class Book extends BookFather implements Comparable<Book> {
    public String t;

    public Book(String t) {
        this.t = t;
    }

    public Book() {

    }

    @Override
    public int compareTo(Book o) {
        return t.compareTo(o.t);
    }

    @Override
    public void test() {
        System.out.println("Book");
    }
}
