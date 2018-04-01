package com.imooc.ioc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MoocBeanName implements BeanNameAware, ApplicationContextAware {

    private String beanName;

    public void setBeanName(String name) {
        // 把beanName赋值给成员变量
        this.beanName = name;
        System.out.println("MoocBeanName:" + name);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getBean(this.beanName));
    }
}
