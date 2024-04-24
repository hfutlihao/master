package org.example.springboot.controller;

import org.example.springboot.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;

@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping("sayHello")
    public User sayHello(Integer id, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date, @RequestParam("users")String str){
        System.out.println(id+" "+date);
        System.out.println(str);
        User user =new User("jack",new Date(),new Timestamp(System.currentTimeMillis()));
        return user;
    }

}
