package com.czjk.api.user.service.impl;

import com.czjk.api.user.mapper.UserMapper;
import com.czjk.api.user.pojo.User;
import com.czjk.api.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
