package com.imooc.ioc.test;

import java.io.Serializable;

/**
 * User
 * <p>
 * version 1.0
 *
 * @create 2018-07-27 11:10
 * @copyright huxiaolei1997@gmail.com
 */
public class User implements Serializable {
    private static final long serialVersionUID = -9160775493728460603L;
    private int id;
    private String userName;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
