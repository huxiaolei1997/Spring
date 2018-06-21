package com.imooc.ioc.test;

import java.util.TreeSet;

/**
 * @author xiaolei hu
 * @date 2018/6/16 22:05
 **/
public class TreeTest {
    public static void main(String[] args) {
        new TreeTest().go();
    }

    private void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        TreeSet<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
        // 或者可以这样
        BookCompare bookCompare = new BookCompare();
        TreeSet<Book> treeSet = new TreeSet<>(bookCompare);
        treeSet.add(b1);
        treeSet.add(b2);
        treeSet.add(b3);
        System.out.println(treeSet);
    }
}
