package com.mzy.testjpa.service;


import com.mzy.testjpa.domain.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();
    /**
     * 通过ID查询用户
     * @param id
     * @return
     */
    User findById(Integer id);
    /**
     * 添加用户
     * @param user
     *
     */
    void add(User user);
    /**
     * 通过用户ID删除用户
     * @param id
     *
     */
    void deleteById(Integer id);
}

