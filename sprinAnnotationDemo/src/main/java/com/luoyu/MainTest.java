package com.luoyu;

import com.luoyu.bean.Person;
import com.luoyu.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/8/23 1:21 下午
 * @description
 */

public class MainTest {
    public static void main(String[] args) {

        //从配置类中获取ioc容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        //在容器中的是对象的实例名，Bean的参数
        System.out.println(applicationContext.getEnvironment());

        Person bean = (Person) applicationContext.getBean("person1");
        System.out.println(bean);

        //可以通过这种方式确认下，类对应的实例名是什么？
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}