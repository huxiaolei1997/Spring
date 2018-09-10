package com.imooc.ioc.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 如果这里没有指定bean 的名称，那么bean的名称默认是类名第一个字母小写
// @Component("bean")
@Scope("prototype")
@Component
public class BeanAnnotation {
    public void say(String arg) {
        System.out.println("BeanAnnotation:" + arg);
    }

    // 获取当前实例的hashCode
    public void myHashCode() {
        System.out.println("BeanAnnotation:" + this.hashCode());
    }
}
