package com.wang.wts.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wang.wts.dao.UserDao;
import com.wang.wts.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WangTaiSheng
 * @Date 2020/11/17 9:28
 * @Version 1.0
 */
@Service("userDetailsService")
public class MyUserDetailsSerice implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        UserEntity userEntity = userDao.selectOne(wrapper);
        if (userEntity == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<GrantedAuthority> auth = AuthorityUtils.commaSeparatedStringToAuthorityList(userEntity.getUsername());
        return new User(userEntity.getUsername(),
                new BCryptPasswordEncoder().encode(userEntity.getPassword()),auth);

    }
}
