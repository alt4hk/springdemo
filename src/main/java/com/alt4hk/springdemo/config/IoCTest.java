package com.alt4hk.springdemo.config;


import com.alt4hk.springdemo.pojo.User;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCTest {

    private static Logger log = Logger.getLogger(IoCTest.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("D:/works/springdemo/src/main/resources/log4j.properties");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);
        log.info(user.getId());
    }

}
