package com.imooc.ioc.annotation.injection;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2021年03月20日 19:29 胡晓磊 Exp $
 */
@Service
public class B {
    @Autowired
    private A aa;
//    public void setA(A a) {
//        this.a = a;
//    }
}
