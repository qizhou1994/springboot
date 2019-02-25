package com.zq.mybaits.mulidatasource.mapper.test2;

import com.zq.mybaits.mulidatasource.entity.UserEntity;

import java.util.List;

/**
 * Created by zq on 2019/2/26.
 */
public interface User2Mapper {
    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
