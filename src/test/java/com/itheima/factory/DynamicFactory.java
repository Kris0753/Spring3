package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.junit.Test;

/**
 * @author ：Kris
 * @date ：Created in 2022/2/7 19:34
 * @description：
 * @modified By：
 * @version: $
 */
public class DynamicFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
