package com.demo.controller;

import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserConrtroller {

    @Autowired
    private UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List getAllUser(){
        List userList = userService.getAllUser();
        return userList;
    }
}
