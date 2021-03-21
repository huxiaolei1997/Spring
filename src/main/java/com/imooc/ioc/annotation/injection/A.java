package com.imooc.ioc.annotation.injection;

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
public class A {

    private B b;

    @Autowired
    public void setB(B b) {
        this.b = b;
    }
}
