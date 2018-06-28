package com.imooc.ioc.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaolei hu
 * @date 2018/6/19 12:43
 **/
public class Test {
    private static volatile int race = 0;

    private static void increase() {
        race++;
        System.out.println(race);
    }
    public static void main(String[] args) {
//        String x = "7";
//        int y = 2;
//        int z = 2;
//        System.out.println(x + y + z);
//
//        List Listlist1 = new ArrayList();
//        Listlist1.add(0);
//        List Listlist2 = Listlist1;
//        System.out.println(Listlist1.get(0) instanceof Integer);
//        System.out.println(Listlist2.get(0) instanceof Integer);
//        List<String> arrayList = new ArrayList<>();
//
//        int a = 1;
        Thread[] threads = new Thread[20];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        //System.out.println("test");
                        //System.out.println(j);
                        increase();
                    }
                }
            });
            threads[i].start();
        }
//        while(Thread.activeCount() > 1) {
//            Thread.yield();
//        }
        System.out.println(race);
    }
}
