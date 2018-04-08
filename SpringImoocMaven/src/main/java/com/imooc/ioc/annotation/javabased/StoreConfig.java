package com.imooc.ioc.annotation.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {

    @Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
    public Store getStringStore() {
        return new StringStoreImpl();
    }
}
