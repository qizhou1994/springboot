package com.zq.testmybaits.mybaitsxml.repository;

import com.zq.testmybaits.mybaitsxml.bean.UserEntity;

import java.util.List;

/**
 * Created by zq on 2019/2/24.
 */
public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
