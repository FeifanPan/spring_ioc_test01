package com.itheima.test;

import com.itheima.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

    public static void main(String[] args) throws Exception {
        //BeanFactory是在首次调用getBean时才进行Bean的创建
        //而ApplicationContext则是配置文件加载，容器一创建就将Bean都实例化并初始化好。
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.show();

        //        userDao.show();
        /*        OtherBean otherBean = applicationContext.getBean(OtherBean.class);
        System.out.println(otherBean);*/

//        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactoryBuilder builder =new SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory = builder.build(in);
        System.out.println("123123");
 System.out.println("123123");
  System.out.println("2");
 System.out.println("2");
        System.out.println("2");
 System.out.println("2");
        System.out.println("123123");
        System.out.println("123123");



    }

}
