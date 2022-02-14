package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：Kris
 * @date ：Created in 2022/2/7 19:39
 * @description：
 * @modified By：
 * @version: $
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void sava() {
//        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao=userDao;
    }


}
