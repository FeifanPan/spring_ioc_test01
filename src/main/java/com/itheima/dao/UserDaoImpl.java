package com.itheima.dao;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {


    @Override
    public void show(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("show.......");
    }
    /*PRIVATE STRING USERNAME;

    PUBLIC USERDAOIMPL() {
        SYSTEM.OUT.PRINTLN("USERDAO实例化");
    }

    PUBLIC VOID SETUSERNAME(STRING USERNAME) {
        THIS.USERNAME = USERNAME;
    }

    PUBLIC VOID INIT() {
        SYSTEM.OUT.PRINTLN("INIT初始化方法执行");
    }

    @OVERRIDE
    PUBLIC VOID AFTERPROPERTIESSET() THROWS EXCEPTION {
        SYSTEM.OUT.PRINTLN("属性设置之后执行.... ");
    }*/
}
