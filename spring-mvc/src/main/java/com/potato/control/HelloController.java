package com.potato.control;

import com.potato.entity.User;
import com.potato.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by potato on 2017/10/16.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/sayhello")
    public String  SayHelloController(){
        User user=userMapper.getbyUserCode("potato");
        System.out.println(user);
        return "hello";
    }


    @RequestMapping("/saypo")
    public String  SayPay(){
        return "hello";
    }

}