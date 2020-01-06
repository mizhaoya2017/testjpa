package com.mzy.testjpa.domain;

import javax.persistence.*;

/**
 * @author ：lijunxuan
 * @date ：Created in 2019/6/28  17:04
 * @description ：
 * @version: 1.0
 */
@Table(name = "user")
@Entity
public class User {
    @Id  //ID代表是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //按照主键自增
    private Integer id;
    //@Column(name="username")   //把数据库里的名字和当前名字做一个绑定关系
    private String  username;
    private String  password;
    private String  name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

