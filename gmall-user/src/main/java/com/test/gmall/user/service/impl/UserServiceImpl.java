package com.test.gmall.user.service.impl;

import com.test.gmall.user.bean.UmsMember;
import com.test.gmall.user.mapper.UserMapper;
import com.test.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList = /*userMapper.selectAll();*/userMapper.SelectAllUser();
        //List<UmsMember> userMapper.getAllUser();
        return umsMemberList;
    }
}
