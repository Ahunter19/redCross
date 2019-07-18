package com.fzsy.redCross.web.controller;

import com.fzsy.redCross.domain.User;
import com.fzsy.redCross.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @version 1.0.0
 * @description 测试类
 * @className HelloController
 * @anthor 陈亮
 * @time 2019/7/18 15:38
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public ModelAndView hello(ModelAndView model) {
        System.out.println("\033[36;4m" + "hello()方法执行了..." + "\033[0m");
        List<User> users = userService.findAll();
        for (User u : users) {
            System.out.println(u);
        }
        return model;
    }
}
