package com.wang.wts.controller;

import com.wang.wts.entity.UserEntity;
import com.wang.wts.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author WangTaiSheng
 * @Date 2020/11/16 16:43
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "测试",notes = "测试")
    @GetMapping("/li")
    public List<UserEntity> queryUser(){
        return userService.queryUser();
    }

}
