package com.wang.wts.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.wts.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author WangTaiSheng
 * @Date 2020/11/16 16:53
 * @Version 1.0
 */

@Repository
public interface UserDao extends BaseMapper<UserEntity> {

}
