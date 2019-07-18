package com.fzsy.redCross.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @version 1.0.0
 * @description 测试类
 * @className 陈亮
 * @anthor RC
 * @time 2019/7/18 15:48
 */
@Component
public class User  implements Serializable {
    private Integer id;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
