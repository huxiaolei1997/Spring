package com.imooc.ioc.test;

import java.util.ArrayList;

public class Player {
    private static final int playerCount;
    private int size;
    private boolean if_play;

    // 静态初始化程序是一段加载类时会执行的程序代码，
    // 它会在其它程序可以使用该类之前就执行
    static {
        playerCount = 3;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Player player = new Player();
        System.out.println(Player.playerCount + ", " + player.getSize() + ", " + player.if_play);
        System.out.println(Math.round(-24.50f));
        // 把primitive主数据类型的数据包装成相应类型的对象
        // 但是从java5.0开始就不必这么做，不必把primitive主数据类型与对象分得那么清楚
        ArrayList list = new ArrayList();
        Integer integer = new Integer(1);
        list.add(integer);
        // 可以直接这样做,autoboxing，让我们不必把primitive主数据类型与对象分得那么清楚
        int i = 1;
        list.add(i);
        System.out.println(integer.intValue());
        //player.size
    }
}
