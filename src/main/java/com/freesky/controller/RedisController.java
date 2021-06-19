package com.freesky.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freesky.bean.IMoocJSONResult;
import com.freesky.bean.User;
import com.freesky.utils.JsonUtils;
import com.freesky.utils.RedisOperator;

@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisOperator redis;

    @Autowired
    private StringRedisTemplate strRedis;

    @RequestMapping("/getJsonList")
    public IMoocJSONResult getJsonList() {

        User user = new User();
        user.setAge(18);
        user.setName("慕课网");
        user.setPassword("123456");
        user.setBirthday(new Date());

        User u1 = new User();
        u1.setAge(19);
        u1.setName("imooc");
        u1.setPassword("123456");
        u1.setBirthday(new Date());

        User u2 = new User();
        u2.setAge(17);
        u2.setName("hello imooc");
        u2.setPassword("123456");
        u2.setBirthday(new Date());

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(u1);
        userList.add(u2);

        redis.set("json:info:userlist", JsonUtils.objectToJson(userList), 2000);

        String userListJson = redis.get("json:info:userlist");
        List<User> userListBorn = JsonUtils.jsonToList(userListJson, User.class);

        return IMoocJSONResult.ok(userListBorn);
    }

    @RequestMapping("/test")
    public IMoocJSONResult test() {

        strRedis.opsForValue().set("imooc-cache", "hello 慕课网~~~~~~");

        User user = new User();
        user.setName("imooc");
        user.setPassword("abc123");
        user.setBirthday(new Date());
        user.setDesc("测试Redis");
        strRedis.opsForValue().set("json:user", JsonUtils.objectToJson(user));

        User jsonUser = JsonUtils.jsonToPojo(strRedis.opsForValue().get("json:user"), User.class);

        return IMoocJSONResult.ok(jsonUser);
    }

    @RequestMapping("/value")
    public IMoocJSONResult value() {
        strRedis.opsForValue().set("imooc-cache", "hello 慕课网~~~~~~");

        return IMoocJSONResult.ok(strRedis.opsForValue().get("imooc-cache"));
    }

}