package com.imooc.ioc.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;


public class MoocResource implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource() throws IOException {
        // 通过classpath加载文件
        // Resource resource = applicationContext.getResource("classpath:spring/config.txt");
        // 通过绝对路径加载文件
        // Resource resource = applicationContext.getResource("file:  D:\\Spring\\SpringImoocMaven\\src\\main\\resources\\spring\\config.txt;");
        // 通过url加载文件
        Resource resource = applicationContext.getResource("url:http://echarts.baidu.com/feature.html");
        //http://echarts.baidu.com/feature.html
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
