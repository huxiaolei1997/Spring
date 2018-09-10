package com.imooc.ioc.injection;

import java.util.*;

/**
 * @author xiaolei hu
 * @date 2018/6/27 20:11
 **/
public class UserNameServiceImpl implements UserNameService {
    private String userName;
    private int age;
    private List<Integer> list;
    private List<Object> list2;
    private Properties properties;
    private Map<Integer, Object> map;
    private Set<Object> set;

    public void setSet(Set<Object> set) {
        this.set = set;
    }

    public void setMap(Map<Integer, Object> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setList2(List<Object> list2) {
        this.list2 = list2;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void test() {
        System.out.println("这是注入的值：" + userName + ", " + age + "," + list.toString());
        for (Object a : list2) {
            System.out.println(a.hashCode());
        }
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

        for (Map.Entry<Integer, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        for (Object o : set) {
            System.out.println(o.hashCode());
        }
    }
}
