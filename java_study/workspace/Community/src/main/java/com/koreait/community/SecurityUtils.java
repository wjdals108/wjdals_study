package com.koreait.community;

import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;

import com.koreait.community.model.UserEntity;

@Component
public class SecurityUtils {
	public int getUserPk(HttpSession hs) {
		UserEntity loginUser = (UserEntity)hs.getAttribute(Const.KEY_LOGINUSER);
		return loginUser.getUserPk();
	}
	
	public String getSalt() {
		return BCrypt.gensalt();
	}
	
	public String getHashPw(String pw, String salt) {
		return BCrypt.hashpw(pw, salt);
	}
}
