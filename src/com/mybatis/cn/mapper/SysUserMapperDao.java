package com.mybatis.cn.mapper;

import com.mybatis.cn.entity.SysUser;
import com.mybatis.cn.entity.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by liKun on 2018/1/11 0011.
 */
public class SysUserMapperDao implements SysUserMapper {
    SqlSession sqlSession=new MybaitsDao().getSqlSession();
    @Override
    public List<SysUser> findAll() {
        return sqlSession.selectList("com.mybatis.cn.mapper.SysUserMapper.findAll");
    }

    @Override
    public List<User> findAll1() {
        return sqlSession.selectList("com.mybatis.cn.mapper.SysUserMapper.findAll1");
    }
}
