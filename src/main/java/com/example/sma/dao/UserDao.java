package com.example.sma.dao;

import com.example.sma.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Insert("INSERT INTO t_user(name, age, created_date) VALUES(#{name}, #{age}, NOW() )")
    void save(@Param("name") String name, @Param("age") int age);

    @Select("SELECT * FROM t_user WHERE name=#{name}")
    User getUser(String name);

}
