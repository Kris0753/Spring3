package com.itheima.demo;

import com.itheima.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：Kris
 * @date ：Created in 2022/2/7 18:07
 * @description：
 * @modified By：
 * @version: $
 */
public class UserDaoDemo {
    @Test
    public void test(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
}
