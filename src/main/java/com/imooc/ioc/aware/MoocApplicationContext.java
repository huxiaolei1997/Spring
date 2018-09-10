package com.imooc.ioc.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MoocApplicationContext implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("MoocApplicationContext: " + applicationContext.getBean("moocApplicationContext"));
        // 获取实例的hashCode，可以看到测试类中获取的hashCode和获取的hashCode是一样的，applicationContext成功的注入到了这个方法当中
        System.out.println("MoocApplicationContext: " + applicationContext.getBean("moocApplicationContext").hashCode());
    }

    public void test() {
        System.out.println("MoocApplicationContext:" + applicationContext.getBean("moocApplicationContext").getClass());
    }
}
