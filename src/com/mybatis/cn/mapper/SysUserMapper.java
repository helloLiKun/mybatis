package com.mybatis.cn.mapper;

import com.mybatis.cn.entity.SysUser;
import com.mybatis.cn.entity.User;

import java.util.List;

/**
 * Created by liKun on 2018/1/11 0011.
 */
public interface SysUserMapper {
    List<SysUser> findAll();
    List<User> findAll1();
    SysUser findById(String id);
    void save(SysUser sysUser);
    void update(SysUser sysUser);
    void delete(String id);
}
