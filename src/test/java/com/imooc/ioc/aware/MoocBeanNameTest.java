package com.imooc.ioc.aware;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoocBeanNameTest {

    @Test
    public void testSetBeanName() {
        String springXmlPath = "classpath*:spring/spring-ioc.xml";
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(springXmlPath);
        abstractApplicationContext.start();
        MoocBeanName moocBeanName = abstractApplicationContext.getBean("moocBeanName", MoocBeanName.class);
        System.out.println("moocBeanName:" + moocBeanName.hashCode());
        //moocBeanName.setBeanName();
        abstractApplicationContext.close();
    }
}