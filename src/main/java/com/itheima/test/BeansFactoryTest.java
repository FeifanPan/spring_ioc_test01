package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeansFactoryTest {
    public static void main(String[] args) {
        //创建工厂对象
        DefaultListableBeanFactory beanFactory =new DefaultListableBeanFactory();
        //创建一个读取器（xml文件）
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        //加载配置文件
        reader.loadBeanDefinitions("beans.xml");
        //获取Bean实例对象
        UserService userService = (UserService)beanFactory.getBean("userService");
//        System.out.println(userService);

        UserDao userDao= (UserDao) beanFactory.getBean("userDao");
//        System.out.println(userDao);


    }




}
