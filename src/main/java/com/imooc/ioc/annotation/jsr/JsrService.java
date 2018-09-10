package com.imooc.ioc.annotation.jsr;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

//@Service
// 使用@Named注解需要引入 javax.inject.jar
@Named
public class JsrService {

    //@Resource //也可以使用@Autowire
    //@Inject
    private JsrDAO jsrDAO;

    //@Resource
    @Inject
    public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }

    @PostConstruct
    public void init() {
        System.out.println("JsrServcie init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JsrSevice destory");
    }

    public void save() {
        jsrDAO.save();
    }
}
