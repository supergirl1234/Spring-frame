package com.lei.controller;

import com.lei.po.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private RedisTemplate redisTemplate;
    @PostMapping("/set")
    public void set(@RequestBody Student student){
        redisTemplate.opsForValue().set("stu",student);
    }

    @GetMapping("/get/{key}")
    public Student get(@PathVariable("key") String key){

        return (Student) redisTemplate.opsForValue().get(key);
    }
    @DeleteMapping("/delete/{key}")
    public boolean delete(@PathVariable("key") String key){

         redisTemplate.delete(key);//删除
         return redisTemplate.hasKey(key);//判断key值是否还存在；
    }
}
