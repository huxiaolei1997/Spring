package com.imooc.ioc.annotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanInvoker {

    // 把实现了BeanInterface接口的两个类注入到BeanInvoker中,把BeanInterface的实例放进list中
    @Autowired
    private List<BeanInterface> list;

    // 把BeanInterface的id和实例放进Map中
    @Autowired
    private Map<String, BeanInterface> map;

    public void say() {
        if (list != null && list.size() != 0) {
            System.out.println("list...");
            for ( BeanInterface bean : list) {
                System.out.println(bean.getClass().getName());
            }
        } else {
            System.out.println("List<BeanInterface> list is null !!!");
        }

        if (map != null && map.size() != 0) {
            System.out.println("map...");
            for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ", " + entry.getValue().getClass().getName());
            }
        } else {
            System.out.println("Map<String, BeanInterface> map is null !!!");
        }
    }
}
