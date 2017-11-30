package com.potato.dao;

import com.potato.entity.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}