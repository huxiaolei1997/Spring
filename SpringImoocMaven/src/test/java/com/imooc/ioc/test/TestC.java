package com.imooc.ioc.test;

import java.util.Arrays;

/**
 * @author xiaolei hu
 * @date 2018/6/21 16:01
 **/
public class TestC {
    public static void main(String[] args) {
        // 冒泡排序
        int[] num = {1, 3, 5, 7, 8, 9, 3, 2, 1};
        int length = num.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int a = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = a;
                }
            }

        }
        System.out.println(Arrays.toString(num));
    }
}
