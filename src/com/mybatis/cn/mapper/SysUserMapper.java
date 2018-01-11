package com.mybatis.cn.mapper;

import com.mybatis.cn.entity.SysUser;
import com.mybatis.cn.entity.User;

import java.util.List;

/**
 * Created by liKun on 2018/1/11 0011.
 * 可以通过加载xml文件在SqlSession中调用相关方法
 * mapper接口对应，实现接口的意义在于实现xml文件中没有的一些逻辑处理（如异常处理，事务提交等。。。）
 */
public interface SysUserMapper {
    List<SysUser> findAll();
    List<User> findAll1();
    SysUser findById(String id);
    void save(SysUser sysUser);
    void update(SysUser sysUser);
    void delete(String id);
}
