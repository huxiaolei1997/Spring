package com.imooc.ioc.annotation.javabased;

import com.sun.javafx.css.StringStore;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private Store<Double> s1;

    @Autowired
    private Store<Integer> s2;

    @Bean
    public MyDriverManager myDriverManager() {
        return new MyDriverManager(url, user_name, password);
    }

    // 默认bean是单例（singleton），我们可以自己指定
//    @Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
//    public Store stringStore() {
//        return new StringStoreImpl();
//    }
//
//    @Bean(name = "stringStore2")
//    @Scope(value = "prototype", proxyMode = ScopedProxyMode.DEFAULT)
//    public Store stringStore2() {
//        return new StringStoreImpl();
//    }

    @Bean
    public DoubleStore doubleStore() {
        return new DoubleStore();
    }

    @Bean
    public IntegerStore integerStore() {
        return new IntegerStore();
    }

    @Bean(name = "stringStoreTest")
    public Store<String> stringStoreTest() {
        System.out.println("s1:" + s1.getClass().getName());
        System.out.println("s2:" + s2.getClass().getName());
        return new StringStoreImpl();
    }
}
