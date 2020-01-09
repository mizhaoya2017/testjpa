package com.mzy.testjpa.service.impl;

import com.mzy.testjpa.dao.UserDao;
import com.mzy.testjpa.domain.User;
import com.mzy.testjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ：lijunxuan
 * @date ：Created in 2019/6/28  17:27
 * @description ：
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
    @Override
    public User findById(Integer id) {
        Optional<User> userById = userDao.findById(id);
        return userById.get();
    }
    @Override
    public void add(User user) {
        userDao.save(user);
    }
    @Override
    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }
}

