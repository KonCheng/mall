package com.koncheng.mall.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.koncheng.mall.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public String login(String username, String password) {
        return null;
    }
}
