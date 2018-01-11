package test;

import com.mybatis.cn.entity.SysUser;
import com.mybatis.cn.entity.User;
import com.mybatis.cn.mapper.MybaitsDao;
import com.mybatis.cn.mapper.SysUserMapper;
import com.mybatis.cn.mapper.SysUserMapperDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by liKun on 2018/1/11 0011.
 */
public class SysUserTest {
    MybaitsDao mybaitsDao=new MybaitsDao();

    SysUserMapperDao sysUserMapperDao=new SysUserMapperDao();

    SysUserMapper sysUserMapper=mybaitsDao.getSqlSession().getMapper(SysUserMapper.class);
    @Test
    public void getSqlSession(){
        System.out.println(mybaitsDao.getSqlSession()+"--------");
    }

    @Test
    public void findAll(){
//        List<SysUser> list=sysUserMapperDao.findAll();
        List<User> list=sysUserMapper.findAll1();
        for(User user:list){
            System.out.println("--user---:"+user);
        }
    }


}
