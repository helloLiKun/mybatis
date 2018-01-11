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

    @Override
    public SysUser findById(String id) {
        return sqlSession.selectOne("com.mybatis.cn.mapper.SysUserMapper.findById",id);
    }

    @Override
    public void save(SysUser sysUser) {
        try{
            sqlSession.insert("com.mybatis.cn.mapper.SysUserMapper.save",sysUser);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Override
    public void update(SysUser sysUser) {
        try{
            sqlSession.update("com.mybatis.cn.mapper.SysUserMapper.update",sysUser);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Override
    public void delete(String id) {
        try{
            sqlSession.delete("com.mybatis.cn.mapper.SysUserMapper.delete",id);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }



}
