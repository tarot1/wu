package com.atguigu.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类名不要写成Test
 */
public class Test01 {

    @Test
    public void testUser(){
        //加载Spring配置文件、对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取创建的对象
        User user =(User) context.getBean("user");
        //调用方法进行测试
        user.add();
    }
}
