package com.imooc.ioc.annotation.multibean;

import com.imooc.ioc.annotation.injection.InjectionService;
import junit.framework.TestCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInvokerTest extends TestCase {

    public void testSay() {
        String springXmlPath = "classpath*:spring/spring-beanannotation.xml";
        // 非web应用使用AbstractApplicationContext初始化bean容器
        // 在非Web应用中，手工加载Spring IoC容器，不能用ApplicationContext，
        // 要用AbstractApplicationContext。用完以后要记得调用ctx.close()关闭容器。
        // 如果不记得关闭容器，最典型的问题就是数据库连接不能释放。
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(springXmlPath);
        abstractApplicationContext.start();
        //InjectionService injectionService = abstractApplicationContext.getBean("injectionServiceImpl", InjectionService.class);
        BeanInvoker beanInvoker = abstractApplicationContext.getBean("beanInvoker", BeanInvoker.class);
        beanInvoker.say();
        //injectionService.sayHelloWorld("hello, world");
        abstractApplicationContext.close();
    }
}