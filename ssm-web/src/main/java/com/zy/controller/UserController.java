package com.zy.controller;

import com.zy.domain.User;
import com.zy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zouyu
 * @description
 * @date 2020/4/23
 */
@RequestMapping("user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserlist")
    public String getUserlist(Model model){
        List<User> userInfo = userService.findUserInfo();
        model.addAttribute("userInfo",userInfo);
        return "userList";
    }
}
