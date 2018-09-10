package com.imooc.ioc.annotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 针对数组有序，对Map无效，设置order可以改变list中实例的输出顺序
@Order(value = 1)
@Component
public class BeanInterfaceImplTwo implements BeanInterface{
}
