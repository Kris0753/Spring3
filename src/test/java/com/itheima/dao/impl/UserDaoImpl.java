package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.junit.Test;

/**
 * @author ：Kris
 * @date ：Created in 2022/2/7 18:00
 * @description：
 * @modified By：
 * @version: $
 */
public class UserDaoImpl implements UserDao {
    private UserDao userDao;

    public UserDaoImpl() {
        System.out.println("UserDAOImpl创建...");
    }

    public void init() {
        System.out.println("初始化方法...");
    }

    public void destory() {
        System.out.println("销毁方法...");
    }

    public void save() {
        System.out.println("save running......");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
