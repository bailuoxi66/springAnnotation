package com.luoyu.bean;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/8/23 1:17 下午
 * @description
 */

public class Person {
    private String name;
    private Integer age;

    public Person() {
        System.out.println("person construction");
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("param person construction");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
