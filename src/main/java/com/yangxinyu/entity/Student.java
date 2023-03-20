package com.yangxinyu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @BelongsProject : spring_security_mvc
 * @BelongsPackage : com.yangxinyu.entity
 * @Date : 2023/3/15 9:45
 * @Author : 星宇
 * @Description :
 */
@Data
@AllArgsConstructor
public class Student {
    private Integer id;
    private String username;
    private String password;
    private List<String> roleList;
}
