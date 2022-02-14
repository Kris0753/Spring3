package com.itheima.test;

import com.itheima.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：Kris
 * @date ：Created in 2022/2/7 19:05
 * @description：
 * @modified By：
 * @version: $
 */
public class SpringTest {
    //测试scope属性
    @Test
    public void test1() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        UserDao userDao2 = (UserDao) app.getBean("userDao");
        System.out.println(userDao);
        System.out.println(userDao2);
    }
}
