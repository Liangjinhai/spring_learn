package com.potato;


import com.potato.entity.User;
import com.potato.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by potato on 2017/10/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-origin.xml")
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void userTest(){

        User user=userMapper.getbyUserCode("potato");
        System.out.println(user);

    }





}
