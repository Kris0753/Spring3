package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @author ：Kris
 * @date ：Created in 2022/2/7 19:29
 * @description：
 * @modified By：
 * @version: $
 */
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
