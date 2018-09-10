package com.imooc.ioc.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void myPrint() {
        for (int i = 0; i < 10; i++) {
            System.out.println("myPrint" + i);
        }
    }

    public static void testSpring() {
        String springXmlPath = "classpath*:spring/spring-ioc.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(springXmlPath);
        OneInterface oneInterface = context.getBean("oneInterface", OneInterface.class);
        oneInterface.say("hello, world");
    }
}