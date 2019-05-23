package com.cxy.test.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author Cxy
 * @Description:
 * @Date 2019-05-22
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 3506871662843575714L;

    private Long id;
    private String username;
    private String password;

    public User(){

    }

    public User(String userName, String passWord){
        super();
        this.password = passWord;
        this.username = userName;
    }
}
