package com.alt4hk.springdemo.config;


import com.alt4hk.springdemo.pojo.BussinessPerson;
import com.alt4hk.springdemo.pojo.ScopeBean;
import com.alt4hk.springdemo.pojo.User;
import com.alt4hk.springdemo.pojo.definition.Person;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCTest {

//    private static Logger log = Logger.getLogger(IoCTest.class);

    public static void main(String[] args) {
//        PropertyConfigurator.configure("D:/works/springdemo/src/main/resources/log4j.properties");
//        PropertyConfigurator.configure("classpath:log4j.properties");

//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        User user = ctx.getBean(User.class);
//        log.info(user.getId());
//        Person person = ctx.getBean(BussinessPerson.class);
//        person.service();

//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        Person person = ctx.getBean(BussinessPerson.class);
//        person.service();
//        ctx.close();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ScopeBean sb1 = ctx.getBean(ScopeBean.class);
        ScopeBean sb2 = ctx.getBean(ScopeBean.class);
        System.out.println(sb1 == sb2);
    }

}
