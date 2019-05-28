package com.cxy.test.generator.controller;

import com.cxy.test.generator.model.User;
import com.cxy.test.generator.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Cxy
 * @Description:
 * @Date 2019-05-28
 */
@RestController
public class TestControllerController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserServiceImpl userService;


    @RequestMapping(value = "/getusers", method = RequestMethod.GET)
    public List<User> getGoods() {
        return userService.selectAll();
    }

}