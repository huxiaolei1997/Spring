package com.imooc.ioc.test;

import java.util.List;

/**
 * @author xiaolei hu
 * @date 2018/6/16 22:38
 **/
public class TestBook {
    public static void main(String[] args) {
        BookChild book2 = new BookChild();
        Book book = new Book();
        BookFather book3 = new BookFather();
        TestBook testBook = new TestBook();
        book.test();
        book2.test();
        book3.test();
        testBook.testBook(book);
//        testBook.testBook(book);
//        testBook.testBook(bookChild);
        //testBook.testBook(book2);
    }

    public void testBook(BookFather book) {
        System.out.println(book.hashCode());
    }
}
