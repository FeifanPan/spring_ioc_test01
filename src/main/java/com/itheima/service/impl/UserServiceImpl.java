package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {


    private UserDao userDao;
    private String userName;
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //BeanFactory去调用该方法，从容器中获得userDao设置到此处
    public void setUserDao(UserDao userDao) {
        System.out.println("属性设置完毕");
        this.userDao = userDao;
    }
    @Override
    public void show(){
        List<User> all=userMapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

}
