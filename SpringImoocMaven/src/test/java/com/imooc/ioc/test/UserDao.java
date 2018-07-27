package com.imooc.ioc.test;

import java.util.ArrayList;
import java.util.List;

/**
 * UserDao
 * <p>
 * version 1.0
 *
 * @create 2018-07-27 11:08
 * @copyright huxiaolei1997@gmail.com
 */
public class UserDao {
    private List<User> userList = new ArrayList<User>();

    public UserDao() {
        User user;
        user = new User();
        user.setId(0);
        user.setUserName("test");
        user.setAge(20);
        userList.add(user);

        user.setId(1);
        user.setUserName("test2");
        user.setAge(20);
        userList.add(user);

        user.setId(2);
        user.setUserName("test3");
        user.setAge(20);
        userList.add(user);

        System.out.println(userList.toString());

    }

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.userList.toString());
    }
}
