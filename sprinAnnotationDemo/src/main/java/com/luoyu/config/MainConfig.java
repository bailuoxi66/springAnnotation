package com.luoyu.config;

import com.luoyu.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/8/23 1:24 下午
 * @description
 */

//配置类==配置文件
@Configuration //告诉Spring这是一个配置类


@ComponentScans(value = {
        @ComponentScan(value = "com.luoyu", includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})
        }, useDefaultFilters = false)
})
//ComponentScan   value：指定要扫描的包
//excludeFilters  Filter[]：指定要排除的包
//includeFilters  Filter[]：指定要添加的包,请注意，务必需要和useDefaultFilters一起使用
public class MainConfig {

    //给容器中注册一个bean；类型为返回值类型，id默认是用方法名作为id
    @Bean("person1")
    public Person person(){
        return new Person("lisi", 12);
    }
}
