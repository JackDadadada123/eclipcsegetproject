package com.jt;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jt.mapper.UserMapper;
import com.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMybatis {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void testFind() {
		List<User> userList=userMapper.findAll();
	System.out.println(userList);
	}
}
