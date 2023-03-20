package com.yangxinyu.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject : spring_security_mvc
 * @BelongsPackage : com.yangxinyu.controller
 * @Date : 2023/3/20 9:04
 * @Author : 星宇
 * @Description :
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/add")
    @PreAuthorize("hasAuthority('add')")
    public void sayAdd(){
        System.out.println("只有有add角色的用户可以访问");
    }

    @RequestMapping("/delete")
    @PreAuthorize("hasAuthority('delete')")
    public void sayDelete(){
        System.out.println("只有有delete角色的用户可以访问");
    }
}
