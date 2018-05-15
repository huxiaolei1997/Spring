package com.imooc.ioc.test;

public class ThreadTester {
    public static void main(String[] args) {
        // runnable相当于线程要执行的任务
        Runnable runnable = new Myrunnable();
        // thread 相当于执行任务的工人，这时，Thread的实例已经创建，但还没有启动。也就是说，有Thead对象，但没有执行中的线程
        Thread thread = new Thread(runnable);
        // 启动线程，当你启动线程的时候，它会变成可执行状态，意思就是说准备好要执行了，只要轮到它就可以开始，这个时候，该线程已经布置好执行空间
        thread.start();
        // 当轮到该线程执行的时候，你可以对Java虚拟机选择执行线程提点意见，但无法强迫它把线程从可执行状态移动到执行中
        System.out.println("back in main");
        // 不只是这样。一旦线程进入可执行状态，它会在可执行与执行中两种状态中切换，同时也有另外一种状态：暂时不可执行（又称为被堵塞状态）
        // 这样程序运行之后可能会有两种执行结果，有时可能是主线程先执行完成，
        // 输出结果是：
        // back in main
        // top o' the stack
        // 有时确是新建的线程先执行完成
        // 输出结果是：
        // top o' the stack
        // back in main
    }
}
