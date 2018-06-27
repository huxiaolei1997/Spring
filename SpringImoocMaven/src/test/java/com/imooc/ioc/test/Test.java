package com.imooc.ioc.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaolei hu
 * @date 2018/6/19 12:43
 **/
public class Test {
    public static void main(String[] args) {
        String x = "7";
        int y = 2;
        int z = 2;
        System.out.println(x + y + z);

        List Listlist1 = new ArrayList();
        Listlist1.add(0);
        List Listlist2 = Listlist1;
        System.out.println(Listlist1.get(0) instanceof Integer);
        System.out.println(Listlist2.get(0) instanceof Integer);
        List<String> arrayList = new ArrayList<>();
    }
}
