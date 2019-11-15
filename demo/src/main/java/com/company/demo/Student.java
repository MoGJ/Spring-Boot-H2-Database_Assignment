package com.company.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author w211198372
 */
@Component
public class Student {
    private String name;
    private String age;
    @Autowired
    Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    public void getNameAge() {
        System.out.println("My name is " + name + " and I am " + age + " years young.");
    }
    
}
