package com.alt4hk.springdemo.config;


import com.alt4hk.springdemo.intercept.MyInterceptor;
import com.alt4hk.springdemo.pojo.BussinessPerson;
import com.alt4hk.springdemo.pojo.ScopeBean;
import com.alt4hk.springdemo.pojo.User;
import com.alt4hk.springdemo.pojo.definition.Person;
import com.alt4hk.springdemo.proxy.ProxyBean;
import com.alt4hk.springdemo.service.HelloService;
import com.alt4hk.springdemo.service.impl.HelloServiceImpl;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

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

//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        ScopeBean sb1 = ctx.getBean(ScopeBean.class);
//        ScopeBean sb2 = ctx.getBean(ScopeBean.class);
//        System.out.println(sb1 == sb2);

        HelloService helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
        proxy.sayHello("aaa");


//        PlatformTransactionManager




    }

}
