package com.imooc.ioc.test;

import edu.princeton.cs.algs4.StdDraw;

/**
 * @author xiaolei hu
 * @date 2018/5/30 15:12
 **/
public class StdDrawTest {
    public static void main(String[] args) {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(.01);
        for (int i = 0; i < N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
    }
}
