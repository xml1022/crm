package com.mage.crm.controller;

import com.mage.crm.po.User;
import com.mage.crm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")

public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<User> findAll(){
        List<User> users = userService.findAll();
        return users;
    }

}
