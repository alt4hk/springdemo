package com.alt4hk.springdemo.pojo;

import com.alt4hk.springdemo.pojo.definition.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

    @Override
    public void use() {
        System.out.println("狗 [" + Dog.class.getSimpleName()+"] 是看门用的");
    }
}
