package com.koreait.community.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreait.community.SecurityUtils;
import com.koreait.community.model.UserEntity;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	@Autowired
	private SecurityUtils sUtils;
	
	public int insUser(UserEntity p) {
		if(p.getUserId() == null || p.getUserId().length() < 2) {
			return 0;
		}
		
		//비밀번호 암호화 하는 부분
		String salt = sUtils.getSalt();
		String hashPw = sUtils.getHashPw(p.getUserPw(), salt);
		p.setSalt(salt);
		p.setUserPw(hashPw);;
		
		return mapper.insUser(p);
	}
}
