package com.mage.crm.service;

import com.mage.crm.mappers.UserMapper;
import com.mage.crm.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> findAll() {
        List<User> users = userMapper.findAll();
        return users;
    }
}
