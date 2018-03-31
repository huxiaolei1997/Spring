package com.imooc.ioc.lifeCircle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// 验证bean的生命周期
public class LifeCircle {
    // bean初始化，通过在bean上配置init-method
    public void init() {
        System.out.println("bean初始化");
    }
    // bean销毁,通过在bean上配置destroy-method
    public void destroy() {
        System.out.println("bean销毁");
    }

    // 销毁bean时调用的方法，通过实现DisposableBean接口
//    public void destroy() throws Exception {
//
//    }


// 初始化bean的时候调用的方法，通过实现InitializingBean接口
//    public void afterPropertiesSet() throws Exception {
//
//    }
}
