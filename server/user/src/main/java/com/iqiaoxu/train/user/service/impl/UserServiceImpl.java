package com.iqiaoxu.train.user.service.impl;

import com.iqiaoxu.train.user.dao.UserMapper;
import com.iqiaoxu.train.user.entity.User;
import com.iqiaoxu.train.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/6/29 7:35
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User addUser(User user) {
        int affected = userMapper.insertUser(user);
        System.out.print(affected);
        return user;
    }

    @Override
    public User getUser(int id) {
        return userMapper.selectUser(id);
    }
}
