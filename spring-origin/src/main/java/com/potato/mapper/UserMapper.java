package com.potato.mapper;


import com.potato.entity.User;

/**
 * Created by potato on 2017/10/17.
 */

public interface UserMapper {

    User getbyUserCode(String code);
}
