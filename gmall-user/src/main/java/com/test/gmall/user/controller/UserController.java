package com.test.gmall.user.controller;

import com.test.gmall.user.bean.UmsMember;
import com.test.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Controller
    public class index {

        //http://user.gmall.com:8080/getAllUser
        @RequestMapping("getAllUser")
        @ResponseBody
        public List<UmsMember> getAllUser(){

            List<UmsMember> umsMember = userService.getAllUser();

            return umsMember;
        }

        //http://user.gmall.com:8080/index1
        @RequestMapping("index1")
        @ResponseBody
        public String index1(){
            return "hello idea springboot";
        }

        //http://user.gmall.com:8080/index
        @RequestMapping("index")
        @ResponseBody
        public String index(){
            return "http://user.gmall.com:8080/index";
        }
    }
}