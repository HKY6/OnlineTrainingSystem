package com.iqiaoxu.train.user.controller;

import com.iqiaoxu.train.user.entity.User;
import com.iqiaoxu.train.user.service.IUserService;
import com.iqiaoxu.train.user.util.PwdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id")int id){
        return userService.getUser(id);
    }

    @GetMapping()
    public List<User> getUsers(){
        return null;
    }

    @PostMapping()
    public User addUser(@RequestBody User user){
//        if(user.getEmail()==null||user.getTel()==null)
//            return null;
//        if(user.getPwd()==null)
//            return null;
        System.out.print(user.getPwd());
        user.setSalt(PwdUtil.getSalt());
        user.setPwd(PwdUtil.md5hash(user.getPwd(),user.getSalt()));

        return userService.addUser(user);
    }

    @PutMapping("/{id}")
    public User modifyUser(@PathVariable("id")int id,@RequestBody User user){
        return null;
    }
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
