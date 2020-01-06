package com.mzy.testjpa.Controller;

import com.willam.Service.UserService;
import com.willam.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：lijunxuan
 * @date ：Created in 2019/6/28  17:02
 * @description ：
 * @version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    /**
     * 通过ID查询用户
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public User findById(Integer id){
        return userService.findById(id);
    }

    /**
     * 添加用户
     * @param user
     *
     */
    @RequestMapping("/add")
    public void add(User user){
        userService.add(user);
    }

    /**
     * 通过用户ID删除用户
     * @param id
     *
     */
    @RequestMapping("/deleteById")
    public void deleteById(Integer id){
        userService.deleteById(id);
    }


}

