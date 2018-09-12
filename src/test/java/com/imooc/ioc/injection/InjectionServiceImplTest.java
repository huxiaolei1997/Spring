package com.imooc.ioc.injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionServiceImplTest {

    @Test
    public void testSayHelloWorld() {
       // InjectionServiceImplTest injectionServiceImplTest = new InjectionServiceImplTest();
        // 加载spring-ioc.xml配置文件
        String springXmlPath = "classpath*:spring/spring-ioc.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(springXmlPath);

        InjectionService injectionService = context.getBean("injectionService", InjectionService.class);
        String userName = "Alice";
        injectionService.sayHelloWorld(userName);

        InjectionService injectionService2 = context.getBean("injectionService", InjectionService.class);
        //String userName = "Alice";
        injectionService2.sayHelloWorld(userName);
    }
}