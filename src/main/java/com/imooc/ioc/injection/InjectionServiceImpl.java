package com.imooc.ioc.injection;

import com.imooc.ioc.injectionDAO.InjectionDAO;
import com.imooc.ioc.injectionDAO.InjectionDAOImpl;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    // 通过设值注入依赖（injectionDAO）
//    public void setInjectionDAO(InjectionDAO injectionDAO) {
//        this.injectionDAO = injectionDAO;
//    }

    // 通过构造器注入依赖(injectionDAO)
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public void sayHelloWorld(String str) {
        System.out.println("测试dependency injection");
        str = str + ":" + this.hashCode();
        injectionDAO.addUser(str);
    }
}
