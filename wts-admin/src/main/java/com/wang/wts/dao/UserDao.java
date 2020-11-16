package com.wang.wts.dao;

import com.wang.wts.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author WangTaiSheng
 * @Date 2020/11/16 16:53
 * @Version 1.0
 */

@Mapper
public interface UserDao {

    /**
     * 查询
     * @return 用户信息
     */
    List<UserEntity> queryUser();
}
