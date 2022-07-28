package com.example.consume.controller;

import com.example.consume.service.RedisService;
import com.example.consume.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/search")
@EnableCaching
public class Search {

    @Autowired
    private RedisService redisService;

    @Autowired
    private UserService userService;

    @Value("${redis.key.ttl}")
    private Long ttl;

    @GetMapping("/{id}")
    public String search(@PathVariable("id") Integer id){
        Object o = redisService.get(String.valueOf(id));
        if (o != null){
            return (String) o + " cache";
        }
        String user = userService.getUserById(id);
        System.out.println("uncache");
        if (user != null){
            redisService.set(String.valueOf(id), user, ttl);
        }
        else {
            redisService.set(String.valueOf(id), null, ttl);
        }
        return user + " uncache";
    }

    @GetMapping("/id/{id}")
    @Cacheable(key = "'user:' + #id", value = "userDetail")
    public String search1(@PathVariable("id") Integer id){
//        Object o = redisService.get(String.valueOf(id));
//        if (o != null){
//            return (String) o + "cache";
//        }
        String user = userService.getUserById(id);
        System.out.println("uncache");
//        if (user != null){
//            redisService.set(String.valueOf(id), user, ttl);
//        }
//        else {
//            redisService.set(String.valueOf(id), null, ttl);
//        }
        return user;
    }
    @RequestMapping("/update/{id}")
    @CacheEvict(key = "'user:' + #id", value = "userDetail")
    public String update(@PathVariable("id") Integer id){
//        Object o = redisService.get(String.valueOf(id));
//        if (o != null){
//            return (String) o + "cache";
//        }
        String user = userService.getUserById(id);
//        System.out.println("uncache");
//        if (user != null){
//            redisService.set(String.valueOf(id), user, ttl);
//        }
//        else {
//            redisService.set(String.valueOf(id), null, ttl);
//        }
        return user;
    }
}
