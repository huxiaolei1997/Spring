package com.imooc.ioc.aop.aspectj.biz;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoocBizTest {

    @Test
    public void testSave() {
        String springXmlPath = "classpath*:spring/spring-aop-aspectj.xml";
        // 非web应用使用AbstractApplicationContext初始化bean容器
        // 在非Web应用中，手工加载Spring IoC容器，不能用ApplicationContext，
        // 要用AbstractApplicationContext。用完以后要记得调用ctx.close()关闭容器。
        // 如果不记得关闭容器，最典型的问题就是数据库连接不能释放。
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(springXmlPath);
        abstractApplicationContext.start();
        MoocBiz moocBiz = abstractApplicationContext.getBean("moocBiz", MoocBiz.class);
        //JsrService jsrService = abstractApplicationContext.getBean("jsrService", JsrService.class);
        //jsrService.save();
        //biz.biz();
        moocBiz.save("This is test.");
        //System.out.println(myDriverManager.getClass().getName());
        abstractApplicationContext.close();
    }
}