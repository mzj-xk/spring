package com.mzj;

import com.mzj.service.UserService;
import com.spring.ApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext(AppConfig.class);
//        System.out.println(context.getBean("userService"));

        UserService userService = (UserService) context.getBean("userService");
        userService.test();

    }
}
