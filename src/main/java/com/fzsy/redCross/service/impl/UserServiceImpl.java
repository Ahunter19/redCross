package com.fzsy.redCross.service.impl;

import com.fzsy.redCross.dao.IUserDao;
import com.fzsy.redCross.domain.User;
import com.fzsy.redCross.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0.0
 * @description
 * @className 陈亮
 * @anthor RC
 * @time 2019/7/18 16:00
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
