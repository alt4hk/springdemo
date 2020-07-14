package com.alt4hk.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.alt4hk.springdemo.*")
public class AppConfig {

//    @Bean(name="user")
//    public User initUser() {
//        User user = new User();
//        user.setId(1l);
//        user.setUserName("user_name_1");
//        user.setNote("note_1");
//        return user;
//    }
}
