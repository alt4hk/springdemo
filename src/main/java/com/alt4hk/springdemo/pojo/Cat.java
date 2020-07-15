package com.alt4hk.springdemo.pojo;

import com.alt4hk.springdemo.pojo.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cat implements Animal {

    @Override
    public void use() {
        System.out.println("猫 [" + Cat.class.getSimpleName()+"] 是抓老鼠的");
    }
}
