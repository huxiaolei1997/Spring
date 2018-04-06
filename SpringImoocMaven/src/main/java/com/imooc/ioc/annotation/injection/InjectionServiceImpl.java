package com.imooc.ioc.annotation.injection;

import com.imooc.ioc.annotation.injectionDAO.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {

    //@Autowired
    private InjectionDAO injectionDAO;

    // @Autowired
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Autowired
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public void sayHelloWorld(String str) {
        System.out.println("测试dependency injection");
        str = str + ":" + this.hashCode();
        injectionDAO.addUser(str);
    }
}
