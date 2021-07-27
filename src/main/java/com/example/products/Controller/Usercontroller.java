package com.example.products.Controller;

import com.example.products.Dao.User;
import com.example.products.Service.UserServiceImpl;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class Usercontroller {

    @Autowired
    private UserServiceImpl userService;
    //用户注册 username 和password
    @PostMapping("/signup")
    public int addUser(@RequestBody User user){

        int stat = userService.insertUser(user);
        return stat;
    }
    //用户登录 username 和password
    @PostMapping("/login")
    public User ValidateUser(@RequestBody User user){
        User stat = userService.validate(user);
        return stat;
    }
}
