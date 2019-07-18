package com.fzsy.redCross.dao;

import com.fzsy.redCross.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0.0
 * @description 用户dao接口
 * @className 陈亮
 * @anthor RC
 * @time 2019/7/18 15:47
 */
@Repository
public interface IUserDao {
      List<User> findAll();
}
