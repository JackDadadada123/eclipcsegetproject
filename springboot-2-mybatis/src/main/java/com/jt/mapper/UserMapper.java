package com.jt.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.User;
//123
public interface UserMapper extends BaseMapper<User>{
	List<User> findAll();
}
