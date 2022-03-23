package com.zhuyu.forum1.mapper;

import com.zhuyu.forum1.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {
    @Insert("insert into user (name, accountId,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{koten},#{gmtCreate},#{gmt_modified})")
    public void insert(User user);
    @Select("select * from token where token = #{token}")
    User findByToken(@Param("token") String token);
}
