package com.imooc.ioc.aop;

import com.imooc.ioc.aop.biz.AspectBiz;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectBizTest {

    @Test
    public void testBiz() {
        String springXmlPath = "classpath*:spring/spring-aop-schema-advice.xml";
        // 非web应用使用AbstractApplicationContext初始化bean容器
        // 在非Web应用中，手工加载Spring IoC容器，不能用ApplicationContext，
        // 要用AbstractApplicationContext。用完以后要记得调用ctx.close()关闭容器。
        // 如果不记得关闭容器，最典型的问题就是数据库连接不能释放。
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(springXmlPath);
        abstractApplicationContext.start();
        AspectBiz biz = abstractApplicationContext.getBean("aspectBiz", AspectBiz.class);
        //JsrService jsrService = abstractApplicationContext.getBean("jsrService", JsrService.class);
        //jsrService.save();
        //biz.biz();
        biz.init("moocService", 3);
        //System.out.println(myDriverManager.getClass().getName());
        abstractApplicationContext.close();
    }
}