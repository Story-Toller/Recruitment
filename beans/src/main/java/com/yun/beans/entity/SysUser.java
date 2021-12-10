package com.yun.beans.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sys_user")
public class SysUser {
    /**
     * ID
     */
    @Id
    @Column(name = "user_id")
    private Long userId;


    /**
     * 用户名
     */
    private String username;


    /**
     * 头像地址
     */
    @Column(name = "avatar_name")
    private String avatarName;

    /**
     * 头像真实路径
     */
    @Column(name = "avatar_path")
    private String avatarPath;


    /**
     * 创建日期
     */
    @Column(name = "create_time")
    private Date createTime;
}