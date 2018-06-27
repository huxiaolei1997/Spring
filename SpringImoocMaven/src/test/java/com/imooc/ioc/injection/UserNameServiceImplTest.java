package com.imooc.ioc.injection;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaolei hu
 * @date 2018/6/27 20:14
 **/
public class UserNameServiceImplTest extends TestCase {

    public void testTest1() {
        String springXmlPath = "classpath*:spring/spring-ioc.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(springXmlPath);
        UserNameService userNameService = context.getBean("userNameService", UserNameService.class);
        userNameService.test();
    }
}