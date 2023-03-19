package com.yangxinyu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @BelongsProject : spring_security_mvc
 * @BelongsPackage : com.yangxinyu
 * @Date : 2023/3/17 11:23
 * @Author : 星宇
 * @Description :
 */
@ContextConfiguration(locations = "/spring-security.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestBCryptPasswordEncoder {
    @Test
    public void test01(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("45678");
        System.out.println(encode);
    }

    @Test
    public void test02(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        boolean b = bCryptPasswordEncoder.matches("123456", "$2a$10$kz3ghn3afeO8WSR7CTCzue1RhX6ASrRkPaqthgk19znmqzfp7p2ja");
        System.out.println(b);
    }

}
