package com.imooc.ioc.test;

/**
 * @author xiaolei hu
 * @date 2018/6/14 14:07
 **/
public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            //System.out.println("test");
            System.out.println("这是lambda表达式替代的匿名类");
        });
        thread.setName("thread");
        thread.start();
        thread.interrupt();// 向线程发出中断请求，
        if (thread.isInterrupted()) { // isInterrupted 方法测试线程是否被终止，这一方法和 interrupted 不一样，这个方法不会改变线程的中断状态
            System.out.println(thread.getName() + "线程当前处于中断状态");
        }
        // 或者可以这样
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 匿名类可以用lambda表达式来替代
                System.out.println("匿名类可以用lambda表达式来替代");
            }
        });
        thread1.start();
    }
}
