package com.test.gmall.user.mapper;

import com.test.gmall.user.bean.UmsMember;

import java.util.List;

//import tk.mybatis.mapper.common.Mapper;

public interface UserMapper /*extends Mapper<UmsMember>*/ {
    List<UmsMember> SelectAllUser();

}
