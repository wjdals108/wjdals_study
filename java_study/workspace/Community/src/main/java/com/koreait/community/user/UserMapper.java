package com.koreait.community.user;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;

import com.koreait.community.model.UserEntity;

@Mapper
public interface UserMapper {
	int insUser(UserEntity p);
	UserEntity selUser(UserEntity p);
}
