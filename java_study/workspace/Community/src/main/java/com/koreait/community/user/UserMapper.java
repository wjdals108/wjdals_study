package com.koreait.community.user;

import org.apache.ibatis.annotations.Mapper;

import com.koreait.community.model.UserEntity;

@Mapper
public interface UserMapper {
	int insUser(UserEntity p);
}
