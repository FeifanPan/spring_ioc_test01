package com.itheima.processor;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class HaohaoBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean,String beanName){
        System.out.println("HaohaoBeanPostProcessor执行...");
        return bean;
    }
}
