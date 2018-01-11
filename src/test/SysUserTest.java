package test;

import com.mybatis.cn.entity.SysUser;
import com.mybatis.cn.entity.User;
import com.mybatis.cn.mapper.MybaitsDao;
import com.mybatis.cn.mapper.SysUserMapper;
import com.mybatis.cn.mapper.SysUserMapperDao;
import org.junit.Test;

import java.util.List;

/**
 * Created by liKun on 2018/1/11 0011.
 */
public class SysUserTest {
    SysUserMapper sysUserMapper=new SysUserMapperDao();
    @Test
    public void getSqlSession(){
        MybaitsDao mybaitsDao=new MybaitsDao();
        System.out.println(mybaitsDao.getSqlSession()+"--------");
    }

    @Test
    public void findAll(){
//        List<SysUser> list=sysUserMapperDao.findAll();
        //test resultMap
        List<User> list=sysUserMapper.findAll1();
        for(User user:list){
            System.out.println("--user---:"+user);
        }
    }

    @Test
    public void findByid(){
        SysUser sysUser=sysUserMapper.findById("3");
        System.out.println(sysUser.getName());
    }

    @Test
    public void save(){
        SysUser sysUser=new SysUser();
        sysUser.setId("4");
        sysUser.setIdNum("444");
        sysUser.setName("赵六");
        sysUser.setPwd("666");
        sysUser.setPhoneNum("666");
        sysUserMapper.save(sysUser);
//        sysUserMapper.update(sysUser);
    }

    @Test
    public void delete(){
        sysUserMapper.delete("4");
    }


}
