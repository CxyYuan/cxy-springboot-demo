package com.cxy.test.controller;

import com.cxy.test.mapper.UserMapper;
import com.cxy.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/getusers")
	public List<User> getUsers() {
		List<User> users=userMapper.getAll();
		return users;
	}

    @RequestMapping("/getoneuser")
    public User getOneUser(@RequestParam("id")long id) {
        User user=userMapper.getOne(id);
        return user;
    }
    
}