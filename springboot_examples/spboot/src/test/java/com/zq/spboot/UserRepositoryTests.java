package com.zq.spboot;

import com.zq.spboot.domain.User;
import com.zq.spboot.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Cacheable;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by zq on 2019/2/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        System.out.println("formattedDate = " + formattedDate);
        /*userRepository.(new User("huangzhi","123456","123456@123.com","zh",formattedDate));
        userRepository.save(new User("wenhao","123456","123456@456.com","wh",formattedDate));
        userRepository.save(new User("zq","123456","123456@789.com","zq",formattedDate));
*/
        userRepository.save(new User("zqq", "123456", "123456@7891.com", "zqq", formattedDate));

        Assert.assertEquals(3, userRepository.findAll().size());
        Assert.assertEquals("zqq", userRepository.findByUserNameOrEmail("zq", "123456@789.com").getNickName());
        userRepository.delete(userRepository.findByUserName("wenhao"));
    }

   /* @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public User getUser() {
        User user=userRepository.findByUserName("aa");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }*/

}
