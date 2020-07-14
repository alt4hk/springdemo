package com.alt4hk.springdemo.service;

import com.alt4hk.springdemo.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void printUser(User user) {
        System.out.println("编号：" + user.getId());
    }

}
