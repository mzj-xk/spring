package com.mzj.service;

import com.spring.*;

@Component("userService")
@Scope("prototype")
public class UserServiceImpl implements UserService {

    @Autowired
    private OrderService orderService;

    private String beanName;

    private String name;

    public void test() {
        System.out.println(orderService);
        System.out.println(this.beanName);
    }

    public void setName(String name) {
        this.name = name;
    }


}
