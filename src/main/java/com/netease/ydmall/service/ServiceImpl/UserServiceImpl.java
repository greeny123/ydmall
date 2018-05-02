package com.netease.ydmall.service.ServiceImpl;

import com.netease.ydmall.dao.UserMapper;
import com.netease.ydmall.entity.User;
import com.netease.ydmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertSelective(User user) {
        System.out.println("tetet");
        return userMapper.insertSelective(user);
    }
}
