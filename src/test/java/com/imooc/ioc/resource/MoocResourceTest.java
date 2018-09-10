package com.imooc.ioc.resource;

import junit.framework.TestCase;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MoocResourceTest extends TestCase {

    public void testResource() throws IOException {
        String springXmlPath = "classpath*:spring/spring-ioc.xml";
        // 非web应用使用AbstractApplicationContext初始化bean容器
        // 在非Web应用中，手工加载Spring IoC容器，不能用ApplicationContext，
        // 要用AbstractApplicationContext。用完以后要记得调用ctx.close()关闭容器。
        // 如果不记得关闭容器，最典型的问题就是数据库连接不能释放。
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(springXmlPath);
        abstractApplicationContext.start();
        MoocResource moocResource = abstractApplicationContext.getBean("moocResource", MoocResource.class);
        moocResource.resource();
        abstractApplicationContext.close();
    }
}