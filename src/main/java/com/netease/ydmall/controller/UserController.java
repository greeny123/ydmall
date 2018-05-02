package com.netease.ydmall.controller;


import com.netease.ydmall.entity.User;
import com.netease.ydmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController()
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/insert.do")
    @ResponseBody
    public int insertUser(@RequestParam(value = "name",defaultValue = "default") String name){
        User user = new User();
        user.setUsername(name);
        user.setPassword("dadsa");
        user.setQuestion("sad");
        user.setAnswer("sada");
        user.setRole(0);
        user.setCreateTime(new Date());
        user.setEmail("sda");
        user.setPhone("sdada");
        user.setUpdateTime(new Date());
        System.out.println("第一步controller");
        return iUserService.insertSelective(user);
    }
}
