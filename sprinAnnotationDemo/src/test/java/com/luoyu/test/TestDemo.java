package com.luoyu.test;

import com.luoyu.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/9/8 12:49 上午
 * @description
 */

public class TestDemo {
    @SuppressWarnings("resource")
    @Test
    public void test01(){
        //从主配置类中获取IOC容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        //获取IOC容器中所有的bean
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName );
        }
    }
}
