package com.yangxinyu.service.impl;

import com.yangxinyu.entity.Student;
import com.yangxinyu.service.StudentService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @BelongsProject : spring_security_mvc
 * @BelongsPackage : com.yangxinyu.service.impl
 * @Date : 2023/3/15 11:32
 * @Author : 星宇
 * @Description :
 */
@Service
public class StudentServiceImpl implements StudentService, UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //模拟从数据库拿到用户
        Student student = new Student(1,"zhangsan","123456");
        //如果数据库没有该用户
        if (Objects.isNull(student)){
            return null;
        }
        //取出用户密码（数据库的密码没有进行加密）
        String password = "{noop}" + student.getPassword();

        //权限列表
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority("add"));
        grantedAuthorities.add(new SimpleGrantedAuthority("delete"));
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        return new User(student.getUsername(),password,grantedAuthorities);
    }
}
