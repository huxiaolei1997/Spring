package com.imooc.ioc.test;

/**
 * @author xiaolei hu
 * @date 2018/6/18 13:48
 **/
public class MyApplication {
    //    private float f = 1.0;
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        // 引用不同于指针，引用中既包含指向对象的指针、又包含指向类的指针，test中指向对象的指针确实为空，但指向Test的指针可不为空
//        Test2 test = null;// 如果这时调用的不是静态方法（类方法），那么jvm会出现空指针异常，但是调用静态方法则不会
//        test.hello();
//    }
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 0; i < 10; ++i, sum += i) {

        }
        System.out.println(i);
    }
}
