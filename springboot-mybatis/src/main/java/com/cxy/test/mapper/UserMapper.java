package com.cxy.test.mapper;

import com.cxy.test.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author Cxy
 * @Description:
 * @Date 2019-05-22
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    @Results({@Result(property = "id",  column = "id"),
            @Result(property = "username",  column = "user_name"),
            @Result(property = "password",  column = "user_password")})
    List<User> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({@Result(property = "id",  column = "id"),@Result(property = "username",  column = "user_name")})
    User getOne(Long id);
}
