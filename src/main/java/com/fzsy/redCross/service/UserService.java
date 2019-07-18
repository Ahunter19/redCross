package com.fzsy.redCross.service;

import com.fzsy.redCross.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0.0
 * @description 用户service接口
 * @anthor 陈亮
 * @time 2019/7/18 15:38
 */
@Service
public interface UserService {
    List<User> findAll();
}
