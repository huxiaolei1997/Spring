package com.imooc.ioc.annotation.javabased;

import com.imooc.ioc.annotation.injection.InjectionService;
import junit.framework.TestCase;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StoreConfigTest extends TestCase {

    public void testGetStringStore() {
        String springXmlPath = "classpath*:spring/spring-beanannotation.xml";
        // 非web应用使用AbstractApplicationContext初始化bean容器
        // 在非Web应用中，手工加载Spring IoC容器，不能用ApplicationContext，
        // 要用AbstractApplicationContext。用完以后要记得调用ctx.close()关闭容器。
        // 如果不记得关闭容器，最典型的问题就是数据库连接不能释放。
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(springXmlPath);
        abstractApplicationContext.start();
        // 如果在@Configuration注解的类中没有指定Bean的name,那么getBean方法中的name默认为@Bean注解的方法名，这里是getStringStore
        Store store = abstractApplicationContext.getBean("stringStore", Store.class);
        //injectionService.sayHelloWorld("hello, world");
        System.out.println(store.getClass().getName());
        abstractApplicationContext.close();
    }

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
}