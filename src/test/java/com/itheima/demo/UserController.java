package com.itheima.demo;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：Kris
 * @date ：Created in 2022/2/8 13:41
 * @description：
 * @modified By：
 * @version: $
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
//        UserService userService = new UserServiceImpl();
        userService.sava();
    }
}
