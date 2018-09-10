package com.imooc.ioc.injectionDAO;

public class InjectionDAOImpl implements InjectionDAO {

    /**
     * 模拟添加用户到数据库中
     * @param userName
     */
    public void addUser(String userName) {
        System.out.println("成功添加了一个用户到数据库中，用户名是：" + userName);
    }
}
