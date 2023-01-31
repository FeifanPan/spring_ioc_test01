package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.UserDaoImpl;

public class MyBeanFctory2 {

    public UserDao userDao() {
        //        Bean创建之前可以进行一些其它业务操作
        return new UserDaoImpl();
    }
}
