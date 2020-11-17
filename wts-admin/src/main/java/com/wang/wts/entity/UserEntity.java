package com.wang.wts.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Author WangTaiSheng
 * @Date 2020/11/16 16:52
 * @Version 1.0
 */
@TableName(value = "user")
public class UserEntity {

    private Long id;

    private String username;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
