package com.itheima.processor;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

/*    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof UserDaoImpl){
            UserDaoImpl userDao = (UserDaoImpl) bean;
            userDao.setUserName("haohao");
        }
        System.out.println(beanName + ":postProcessAfterInitialization");

        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "postProcessBeforeInitialization");
        return bean;
    }*/
}
