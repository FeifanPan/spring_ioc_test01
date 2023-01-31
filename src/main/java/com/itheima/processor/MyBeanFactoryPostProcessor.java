package com.itheima.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.expression.BeanFactoryAccessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        System.out.println("BeanDifinitionMap填充完毕后回调该方法");
        System.out.println("MyBeanFactoryPostProcessor的postProcessBeanFactory");
        /*//注册BeanDefinition
        BeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClassName("PersonDaoImpl");
        //强转成DefaultListableBeanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) beanFactory;
        defaultListableBeanFactory.registerBeanDefinition("personDao", beanDefinition);*/
        //修改某个Beandifinition
        /*BeanDefinition beanDefinition=beanFactory.getBeanDefinition("userService");
        beanDefinition.setBeanClassName("UserDaoImpl");*/


    }
}
