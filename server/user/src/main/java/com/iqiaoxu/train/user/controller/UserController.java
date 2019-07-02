package com.iqiaoxu.train.user.controller;

import com.iqiaoxu.train.user.entity.User;
import com.iqiaoxu.train.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/6/29 7:36
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

//    @PostMapping()
//    public User newUser(String email,String pwd){
//        //User user = new User();
//        return userService.addUser(email,pwd);
//    }
//
//    @PutMapping("/{id}")
//    public User updateUserInfo(@PathVariable int id, @RequestBody User user){
//        //user.setId(id);
//        return userService.updateUserInfo(user);
//    }
//    @PatchMapping("/{id}")
//    public User updateUserPartInfo(@PathVariable int id, @RequestBody User user){
//        //user.setId(id);
//        return userService.updateUserPartInfo(user);
//    }
//
//    @GetMapping("/{id}")
//    public User getUser(@PathVariable int id){
//        return userService.getUser(id);
//    }
//
//    @PutMapping(value = "/{id}/email")
//    public String resetEmail(@PathVariable int id, String email){
//        return userService.resetEmail(id,email);
//    }
//
//    @PutMapping("/{id}/pwd")
//    public String resetPwd(@PathVariable int id, String oldPwd ,String newPwd){
//        return userService.resetPwd(id,oldPwd,newPwd);
//    }
//
//    @GetMapping("/hello")
//    public String hello(){
//        return "Hello! this is users controller!";
//    }
}
