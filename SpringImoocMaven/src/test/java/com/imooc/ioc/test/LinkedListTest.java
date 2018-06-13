package com.imooc.ioc.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author xiaolei hu
 * @date 2018/6/10 15:49
 **/
public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        ListIterator<String> iterator = a.listIterator(1);
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(a.get(1));
        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");
    }
}
