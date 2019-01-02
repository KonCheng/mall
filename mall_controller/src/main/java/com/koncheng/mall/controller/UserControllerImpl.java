package com.koncheng.mall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.koncheng.mall.UserService;

public class UserControllerImpl implements UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Override
    public String login(String username, String password) {
        return userService.login(username, password);
    }
}
