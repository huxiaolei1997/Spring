package com.imooc.ioc.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Song {
    String title;

    public void test() {
        System.out.println("test");
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object aSong) {
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
    }

    public static void main(String[] args) {
        // 这里song 和song2都引用了同一个对象
        Song song = new Song();
        song.title = "test";
        Song song2 = song;
        Song song3 = new Song();
        song3.title = "test";
        // true 同一个对象的两个引用
        System.out.println(song2 == song);
        // false 两个不同对象的两个引用，如果想让这两个对象比较返回true的话，那么必须覆盖hashCode()和equals()方法
        System.out.println(song.equals(song3) && song.hashCode() == song3.hashCode());
    }
}
