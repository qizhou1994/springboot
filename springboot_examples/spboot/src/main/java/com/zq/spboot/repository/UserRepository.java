package com.zq.spboot.repository;

import com.zq.spboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zq on 2019/2/16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
}
