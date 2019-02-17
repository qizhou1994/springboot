package com.zq.spboot.controller;

import com.zq.spboot.domain.User;
import com.zq.spboot.repository.UserRepository;
import com.zq.spboot.util.NeoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by zq on 2019/2/14.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/hello")
    public String index() {
        return "Hello Worldaaaaa";
    }

   /* @RequestMapping("/getUser")
    public SecurityProperties.User getUser() {
        SecurityProperties.User user = new SecurityProperties.User();
        user.setName("zq");
        user.setPassword("123456");
        return user;
    }*/

    @RequestMapping("/getNeoPro")
    public NeoProperties getNeoPro() {
        NeoProperties neoProperties = new NeoProperties();

        return neoProperties;
    }

   /* @RequestMapping("/getUser")

    public User getUser() {
        User user=userRepository.findByUserName("zqq");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }*/

    @RequestMapping("/uid")
    public String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }

    @RequestMapping("/getUser")
    @Cacheable(value="user-key", keyGenerator="KeyGenerator")
    public User getUser(String userName) {
        User user = userRepository.findByUserName(userName);
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }
}
