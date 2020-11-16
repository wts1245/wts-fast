package com.wang.wts.service;

import com.wang.wts.entity.UserEntity;

import java.util.List;

/**
 * @Author WangTaiSheng
 * @Date 2020/11/16 16:52
 * @Version 1.0
 */
public interface UserService {
    List<UserEntity> queryUser();
}
