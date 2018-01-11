package com.mybatis.cn.mapper;

import com.mybatis.cn.entity.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import test.SysUserTest;

import java.util.List;

/**
 * Created by liKun on 2018/1/11 0011.
 */
public class MybaitsDao {
    private SqlSessionFactory sqlSessionFactory;

    public MybaitsDao() {
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        //通过类加载器读取SqlMapConfig.xml文件，创建SqlSessionFactory对象
        sqlSessionFactory=builder.build(SysUserTest.class.getClassLoader().getResourceAsStream("resource/SqlMapConfig.xml"));
    }

    /**
     * 创建连接
     * @param
     */
    public SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

//    public static void main(String[] args){
//        SqlSession sqlSession=getSqlSession();
//        List<SysUser> list=sqlSession.selectList("com.mybatis.cn.mapper.SysUserMapper.findAll");
//        for(SysUser u:list){
//            System.out.println(u);
//        }
//        sqlSession.close();
//    }
}
