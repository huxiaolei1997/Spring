package com.imooc.ioc.annotation.javabased;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StoreConfigTest {

    @Test
    public void testGetStringStore() {
        String springXmlPath = "classpath*:spring/spring-beanannotation.xml";
        // 非web应用使用AbstractApplicationContext初始化bean容器
        // 在非Web应用中，手工加载Spring IoC容器，不能用ApplicationContext，
        // 要用AbstractApplicationContext。用完以后要记得调用ctx.close()关闭容器。
        // 如果不记得关闭容器，最典型的问题就是数据库连接不能释放。
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(springXmlPath);
        abstractApplicationContext.start();
        // 如果在@Configuration注解的类中没有指定Bean的name,那么getBean方法中的name默认为@Bean注解的方法名，这里的bean已经指定了name,所以是 stringStore
        Store store = abstractApplicationContext.getBean("stringStore", Store.class);
        //injectionService.sayHelloWorld("hello, world");
        System.out.println(store.getClass().getName());
        abstractApplicationContext.close();
    }

    @Test
    public void testStringStore2() {
        String springXmlPath = "classpath*:spring/spring-beanannotation.xml";
        // 非web应用使用AbstractApplicationContext初始化bean容器
        // 在非Web应用中，手工加载Spring IoC容器，不能用ApplicationContext，
        // 要用AbstractApplicationContext。用完以后要记得调用ctx.close()关闭容器。
        // 如果不记得关闭容器，最典型的问题就是数据库连接不能释放。
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(springXmlPath);
        abstractApplicationContext.start();
        // 如果在@Configuration注解的类中没有指定Bean的name,那么getBean方法中的name默认为@Bean注解的方法名，这里的bean已经指定了name,所以是 stringStore2
        Store store = abstractApplicationContext.getBean("stringStore2", Store.class);
        Store store2 = abstractApplicationContext.getBean("stringStore2", Store.class);
        //injectionService.sayHelloWorld("hello, world");
        System.out.println("--store start--");
        System.out.println(store.hashCode());
        System.out.println(store2.hashCode());
        System.out.println("--store end--");
        abstractApplicationContext.close();
    }

    @Test
    public void testMyDriverManager() {
        String springXmlPath = "classpath*:spring/spring-beanannotation.xml";
        // 非web应用使用AbstractApplicationContext初始化bean容器
        // 在非Web应用中，手工加载Spring IoC容器，不能用ApplicationContext，
        // 要用AbstractApplicationContext。用完以后要记得调用ctx.close()关闭容器。
        // 如果不记得关闭容器，最典型的问题就是数据库连接不能释放。
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(springXmlPath);
        abstractApplicationContext.start();
        MyDriverManager myDriverManager = abstractApplicationContext.getBean("myDriverManager", MyDriverManager.class);
        System.out.println(myDriverManager.getClass().getName());
        abstractApplicationContext.close();

    }

    @Test
    public void testStringStore3() {
        String springXmlPath = "classpath*:spring/spring-beanannotation.xml";
        // 非web应用使用AbstractApplicationContext初始化bean容器
        // 在非Web应用中，手工加载Spring IoC容器，不能用ApplicationContext，
        // 要用AbstractApplicationContext。用完以后要记得调用ctx.close()关闭容器。
        // 如果不记得关闭容器，最典型的问题就是数据库连接不能释放。
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(springXmlPath);
        abstractApplicationContext.start();
        // 如果在@Configuration注解的类中没有指定Bean的name,那么getBean方法中的name默认为@Bean注解的方法名，这里的bean已经指定了name,所以是 stringStore
        StringStoreImpl store = abstractApplicationContext.getBean("stringStoreTest", StringStoreImpl.class);
        //injectionService.sayHelloWorld("hello, world");
        //System.out.println(store.getClass().getName());
        abstractApplicationContext.close();
    }

}