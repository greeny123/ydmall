package com.netease.ydmall.service;


import com.netease.ydmall.entity.User;

public interface IUserService {
    int insertSelective(User user);
}

