package com.reload.gradlessm.service.impl;

import com.reload.gradlessm.mapper.UserMapper;
import com.reload.gradlessm.model.User;
import com.reload.gradlessm.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

}
