package com.imooc.ioc.test;

import java.util.Comparator;

/**
 * @author xiaolei hu
 * @date 2018/6/16 22:26
 **/
public class BookCompare implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.t.compareTo(o2.t);
    }
}
