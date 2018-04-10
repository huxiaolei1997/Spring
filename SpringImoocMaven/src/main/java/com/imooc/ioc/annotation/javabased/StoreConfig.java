package com.imooc.ioc.annotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

// 这是一个配置类，类似于xml文件
@Configuration
@ImportResource("classpath:jdbc/config.xml")
public class StoreConfig {
    @Value("${url}")
    private String url;

    // 在jdbc.properties中需要注意的是，不能写user_name，否则获取到的是登录当前操作系统的用户名，可以改成jdbc.user_name
    @Value("${jdbc.username}")
    private String user_name;

    @Value("${password}")
    private String password;

    @Bean
    public MyDriverManager myDriverManager() {
        return new MyDriverManager(url, user_name, password);
    }

    // 默认bean是单例（singleton），我们可以自己指定
    @Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
    public Store stringStore() {
        return new StringStoreImpl();
    }

    @Bean(name = "stringStore2")
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.DEFAULT)
    public Store stringStore2() {
        return new StringStoreImpl();
    }
}
