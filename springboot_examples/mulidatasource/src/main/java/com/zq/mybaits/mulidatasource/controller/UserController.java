package com.zq.mybaits.mulidatasource.controller;

import com.zq.mybaits.mulidatasource.entity.UserEntity;
import com.zq.mybaits.mulidatasource.mapper.test1.UserMapper;
import com.zq.mybaits.mulidatasource.mapper.test2.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zq on 2019/2/26.
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private User2Mapper user2Mapper;

    @RequestMapping("/getUsers")
    public List<UserEntity> getUsers() {
        List<UserEntity> users=userMapper.getAll();
        return users;
    }
    @RequestMapping("/getUser2s")
    public List<UserEntity> getUser2s() {
        List<UserEntity> users=user2Mapper.getAll();
        return users;
    }
    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
        UserEntity user=user2Mapper.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(UserEntity user) {
        userMapper.insert(user);
    }

    @RequestMapping("/add2")
    public void save2(UserEntity user) {
        user2Mapper.insert(user);
    }

    @RequestMapping(value="update")
    public void update(UserEntity user) {
        user2Mapper.update(user);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }
}
