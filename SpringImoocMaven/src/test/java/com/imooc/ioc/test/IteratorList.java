package com.imooc.ioc.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xiaolei hu
 * @date 2018/6/1 14:53
 **/
public class IteratorList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add(6, "G");
        // 通过迭代器遍历实现了Iterator接口的集合
        Iterator<String> list_iter = list.iterator();

        while (list_iter.hasNext()) {
            System.out.println(list_iter.next());

        }

        // for each遍历集合
        for (String element : list) {
            System.out.println(element);
        }

        //list2.forEachRemaining(element -> System.out.println(element));
    }
}
